
package monopoly;


public class ConcreteNP implements ThemeFactory {

    @Override
    public Board createOGBoard(int totalPlayers, GUI g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Board createNPBoard(int totalPlayers, GUI g) {
        Board b = new NPBoard(totalPlayers, g);
        return b;
    }

}
