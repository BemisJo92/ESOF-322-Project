
package esof322.pa4.team17;


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
    public static int cardIDTotal = 0;
    final static int minPlayers =2;
    final static int maxPlayers = 4;
    final static int minThemeNum =1;    
    final static int maxThemeNum = 2;   //max number of themes to choose from
    static GUI gui;
    public static int theme;
    public static ThemeFactory factory = null;

    //implement a timer
    Timer gameTimer = new Timer();
    TimerTask callGameOver = new TimerTask(){           //timer task that calls gameOver
        public void run()  //call game over method 
        {
            gui.display("The time limit has been reached. The game is now over!");
           
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
        if(theme == 1)
        {
            gameBoard = factory.createOGBoard(totalPlayers, gui);
        }
        else
        {
            gameBoard = factory.createNPBoard(totalPlayers, gui);
                    
        }
        //gameBoard new Board(totalPlayers, gui); //abstract factory?
    }
    
    public static void main(String[] args) throws InterruptedException  //driver method
    {
        
        System.out.println("Monopoly Game Start");
        Scanner scanner = new Scanner(System.in);
        int totalPlayers = 0;
        theme = -1;
        
        while(totalPlayers <minPlayers || totalPlayers > maxPlayers)
        {  
            System.out.println("How many players? (2-4)");
            totalPlayers = scanner.nextInt();
            if(totalPlayers < minPlayers || totalPlayers > maxPlayers)
            {   
                System.out.println("Please enter a valid player count.");
            }
        }
        
        while(theme < minThemeNum|| theme > maxThemeNum)
        {
            System.out.println("Please choose a theme: 1 for Classic, 2 for NationalParks");
            theme = scanner.nextInt();
            switch(theme)
            {
                case 1:
                    System.out.println("You have selected the Classic board.");
                    gui = new GUI(theme);
                    factory = new ConcreteOG();
                    break;
                    
                case 2:
                    System.out.println("You have selected the NationalParks board.");
                    gui = new GUI(theme);
                    factory = new ConcreteNP();
                    break;
                    
                default:
                    System.out.println("This is not a valid option, please select 1 for Classic, 2 for NationalPakrs");
                    break;
            }
        }


        gui.setup();
        Game game = new Game(totalPlayers);   

        
        game.startGame();
    }
    public void startGame() throws InterruptedException 
    {        
        

        Scanner scanner = new Scanner(System.in);
        gui.display("---------------------");
        
        while(gameStatus)
        {
            int die1 = gameBoard.getPlayer().rollDie();
            int die2 = gameBoard.getPlayer().rollDie();
            int rollValue = die1 +die2;
            gui.clearDisplay(); //clear display every turn
                
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
                    gui.display(gameBoard.getPlayer().getName() + " is stuck in jail for another turn");
                }
            }
            else if(!gameBoard.getPlayer().isBroke())           //if the player is NOT broke
            {
                gui.display("Die 1: " + die1);
                gui.display("Die 2: " + die2);
                gameBoard.movePlayer(gameBoard.getPlayer(), rollValue,gui);
            }
            else if(gameBoard.getPlayer().isBroke())            //if the player IS broke
            {
                gui.display("Player is broke. This is game over");
                gameOver();
            }
            gui.display(gameBoard.getPlayer().getName() + "'s turn is over, press 7 to proceed");
            while(scanner.nextInt() != 7)
            {
                Thread.sleep(100);
            }
            gui.display("\nNext players turn -----------------------------------------------------\n\n");
            gameBoard.nextTurn();
        }
    }
    
    public void gameOver() throws InterruptedException  //determine winner and exit
    {
        gameStatus = false;
        gui.display("Here are the money and property stats: ");
        for(Player player: gameBoard.getPlayers())
        {
            gui.display(player.getName() + ":" + " Money:  $" + player.getMoney());
            gui.display("\n\nProperties Owned:\n");
            
            //Acquire all properties of player in a list
            ArrayList<Tile> properties = player.getProperties();
            
            //Print out all properties of player at Game Over
            for(Tile t: properties)
                {gui.display(t.getName());}
            
            gui.display("\n");
            
            Player winner = gameBoard.getRichestPlayer();
            gui.display("And the winner is: " + winner.getName());
        }
        
        
        Thread.sleep(100);
        gui.display("Program will now exit");
        Thread.sleep(100);
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
