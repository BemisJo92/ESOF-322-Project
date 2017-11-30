
package monopoly;


public class ConcreteNP implements ThemeFactory {

    @Override
    public void createOGBoard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createNPBoard() {
        return new NPBoard();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
