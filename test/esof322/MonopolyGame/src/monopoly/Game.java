
package monopoly;


import java.util.Scanner;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
    Board gameBoard;                   //instance of board
    final int timeLimit = 10;         //time limit in mins
    
    //implement a timer
    Timer gameTimer = new Timer();
    TimerTask callGameOver = new TimerTask(){           //timer task that calls gameOver
        public void run()  //call game over method 
        {
            gameOver();
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
    
    public static void main(String[] args)  //driver method
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
        scanner.close();    
        Game game = new Game(totalPlayers);      
        game.startGame();
    }
    public void startGame() //need to implement a timer here
    {        
        System.out.println("---------------------");
        
        while(!gameStatus(currentGameTime))
        {
            if(!gameBoard.getPlayer().isBroke())
            {
                int die1 = gameBoard.getPlayer().rollDie();
                int die2 = gameBoard.getPlayer().rollDie();
                int rollValue = die1 + die2;
                gameBoard.movePlayer(gameBoard.getPlayer(), rollValue);
            }
            System.out.println("Next players turn (from Game)");
            gameBoard.nextTurn();
        }
        
        System.out.println("The time limit has been reached. The game is now over!");
        

        
    }
    
    public boolean gameStatus(int time)    //true if Game is over
    {
        if(time >= timeLimit)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    public void gameOver()  //determine winner and exit
    {
        System.out.println("Program will now exit");
        System.exit(0);
    }
    
    
    
}
