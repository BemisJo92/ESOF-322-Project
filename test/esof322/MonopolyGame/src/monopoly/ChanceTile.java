/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.Random;


public class ChanceTile extends Tile{
    GUI gui;
    int random;
    Random rand;
    public ChanceTile(String name, int xCoord, int yCoord) {
        super(name, xCoord, yCoord);
        rand = new Random();
    }    

    @Override
    public void doAction(Player player, Board board) {
        gui = board.getGui();
        gui.display("Landed on chance tile");
        //get a card at random and do the approperate action
       
        ChanceCard card = getCard(board);
        gui.display("Card Drawn: " + card.getName());
        if (card.getToTileNum() != -1)
        {
            //move player to that tile
            Tile t = board.getTile(card.getToTileNum());            
            gui.movePlayer(player.getIdNum(), t.getX(), t.getY());
            player.setTile(card.getToTileNum());
            
            
        }
        //no move needed
        adjMoney(player, card.getMoneyAdjust());    //adjust players money
        
        if(card.getName().equals("Get out of jail free card"))
        {
            player.addJailFreeCard();
        }
        
    }
    
    public void adjMoney(Player p, int amount)        //Junit test for this?
    {
        if(amount <0)
        {
            p.removeMoney(amount);
        }else p.addMoney(amount);
    }

    public ChanceCard getCard(Board board)    //need to create a junit test for this if you make of size 1, it should only return that card
    {
        random = rand.nextInt(board.getNumChanceCards()); //should be 4 
        ChanceCard[] allCards = board.getChanceCards();
        return allCards[random];
    }
    @Override
    public int getMortgage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return -1;
    }

    @Override
    public void setMortgageStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
}
