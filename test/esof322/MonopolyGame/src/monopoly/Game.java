
package monopoly;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game {
    Board gameBoard;                   //instance of board
    final int timeLimit = 10;         //time limit in mins
    Boolean gameStatus = true;
    public static int tileIDTotal = 0;
    GUI gui;

    //implement a timer
    Timer gameTimer = new Timer();
    TimerTask callGameOver = new TimerTask(){           //timer task that calls gameOver
        public void run()  //call game over method 
        {
            System.out.println("The time limit has been reached. The game is now over!");
           
            try {               //try catch for Thread.sleep in gameOver()
                gameOver();
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
      
    public void TimedExit()
    {
        gameTimer.schedule(callGameOver, new Date(System.currentTimeMillis()+(timeLimit*60000)));   //execute timer task "callGameOver" after 'timeLimit' mins
    }
    
    public Game(int totalPlayers)
    {
        gameBoard = new Board(totalPlayers);
    }
    
    public static void main(String[] args) throws InterruptedException  //driver method
    {
        System.out.println("Monopoly Game Start");
        Scanner scanner = new Scanner(System.in);
        int totalPlayers = 0;
        while(totalPlayers <2 || totalPlayers > 4)
        {
            System.out.println("How many players? (2-4)");
            totalPlayers = scanner.nextInt();
            if(totalPlayers < 2 || totalPlayers > 4)
            {
                System.out.println("Please enter a valid player count.");
            }
        }
        //scanner.close();    
        Game game = new Game(totalPlayers);      
        game.startGame();
    }
    public void startGame() throws InterruptedException //need to implement a timer here
    {        
        gui = new GUI();
        gui.setup();

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        
        while(gameStatus)
        {
            int die1 = gameBoard.getPlayer().rollDie();
            int die2 = gameBoard.getPlayer().rollDie();
            int rollValue = die1 +die2;
            
            if(gameBoard.getPlayer().getJailStatus() == true)   //if player is in jail for their turn
            {
                if(die1 == die2 || gameBoard.getPlayer().getJailStayLength() >= 3)        //if the player rolls doubles or they have been in jail for 3 turns, then they are released
                {
                    gameBoard.getPlayer().resetJailStayLength();        //reset the jail stay counter
                    gameBoard.getPlayer().setJailStatus(false);         //remove jail status
                    gameBoard.movePlayer(gameBoard.getPlayer(), rollValue,gui); //move the player
                    
                }else //player did not roll doubles this turn and hasnt been in jail long enough to be released.
                {
                    gameBoard.getPlayer().incrementJailStay();
                    System.out.println(gameBoard.getPlayer().getName() + " is stuck in jail for another turn");
                }
            }
            else if(!gameBoard.getPlayer().isBroke())           //if the player is NOT broke
            {
                System.out.println("Die 1: " + die1);
                System.out.println("Die 2: " + die2);
                gameBoard.movePlayer(gameBoard.getPlayer(), rollValue,gui);
            }
            else if(gameBoard.getPlayer().isBroke())            //if the player IS broke
            {
                System.out.println("Player is broke. This is game over");
                gameOver();
            }
            System.out.println(gameBoard.getPlayer().getName() + "'s turn is over, press 7 to proceed");
            while(scanner.nextInt() != 7)
            {
                Thread.sleep(100);
            }
            System.out.printf("\nNext players turn -----------------------------------------------------\n\n");
            gameBoard.nextTurn();
        }
    }
    
    public void gameOver() throws InterruptedException  //determine winner and exit
    {
        gameStatus = false;
        System.out.println("Here are the money and property stats: ");
        for(Player player: gameBoard.getPlayers())
        {
            System.out.println(player.getName() + ":");
            System.out.println("Money : $" + player.getMoney());
            System.out.printf("\n\nProperties Owned:\n");
            
            //Acquire all properties of player in a list
            ArrayList<Tile> properties = player.getProperties();
            
            //Print out all properties of player at Game Over
            for(Tile t: properties)
                {System.out.println(t.getName());}
            
            System.out.printf("\n");
            
            Player winner = gameBoard.getRichestPlayer();
            System.out.println("And the winner is: " + winner.getName());
        }
        
        
        Thread.sleep(100);
        System.out.println("Program will now exit");
        Thread.sleep(100);
        System.exit(0);
    }
    
    public Board getBoard()
    {
        return gameBoard;
    }   
    
    public boolean getGameStatus()
    {
        return gameStatus;
    }
}
