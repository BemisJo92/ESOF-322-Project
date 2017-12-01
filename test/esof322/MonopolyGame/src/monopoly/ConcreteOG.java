
package monopoly;

public class ConcreteOG implements ThemeFactory{

    @Override
    public Board createOGBoard(int totalPlayers, GUI g) {
        OGBoard b = new OGBoard(totalPlayers);
        return b;
    }

    @Override
    public Board createNPBoard(int totalPlayers, GUI g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
