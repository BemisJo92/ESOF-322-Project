
package monopoly;

public class ConcreteOG implements ThemeFactory{

    @Override
    public Board createOGBoard(int totalPlayers, GUI g) {
        Board b = new OGBoard(totalPlayers, g);
        return b;
    }

    @Override
    public Board createNPBoard(int totalPlayers, GUI g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
