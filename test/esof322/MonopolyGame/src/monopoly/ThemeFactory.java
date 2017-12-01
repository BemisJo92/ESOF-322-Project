package monopoly;

public interface ThemeFactory {
   public Board createOGBoard(int totalPlayers, GUI g);
   public Board createNPBoard(int totalPlayers, GUI g);
}
