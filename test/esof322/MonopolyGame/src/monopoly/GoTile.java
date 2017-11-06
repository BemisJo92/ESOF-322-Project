
package monopoly;


public class GoTile extends Tile
{   
        private final int goMoney = 200;    //amount of money rewarded for passing go
        public GoTile(String name)
        {
            super(name); 
        }
        
        public void doAction(Player player, Board board)
        {
            System.out.println(player.getName() + " is at Go." + player.getName() + " is receiving $200.");
            player.addMoney(goMoney);
        }

    @Override
    public int getMortgage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return -1;
    }

    @Override
    public void setMortgageStatus(Boolean status) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
