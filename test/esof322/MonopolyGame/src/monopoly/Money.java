

package monopoly;


public class Money 
{
    int money = 0;
    
    public int getMoney()
    {
        return money;
    }
    
    public void addMoney(int amount)
    {
        money += amount;
    }
    
    public void removeMoney(int amount)
    {
        money -= amount;
    }
    
    public boolean isBroke()
    {
        return money <= 0;
    }
}
