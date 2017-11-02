

package monopoly;


public class Money 
{
    int money;
    
    public void Money(int startingMoney)
    {
        this.money = startingMoney;
    }
    
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
