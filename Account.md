# Baller9
# AccountModel with Java

package account;

/**
 *
 * @author mkino
 */
public class AccModel 
{
    private int ID;
    private double balance;
    private double annualInterestRate;
    private double withdraw;
    private double deposit;
     
    public AccModel()
    {
        this.ID = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.withdraw = 0;
        this.deposit = 0;
        
    
    }
    
    public AccModel (int ID, double balance, double annualInterestRate,double withdraw, double deposit)
    {
        
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.withdraw = withdraw;
        this.deposit = deposit;
        
    
    
    }
    
    public double getID()
    {
      
        return ID;
    
    
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    
    
    }
    
    public double getbalance()
    {
      return balance;
    }
    
    public void setbalane(double balance)
    {
       this.balance = balance;
    }
    
    public double getannualInterestRate()
    {
      return annualInterestRate;
    }
    
    public void setannualInterestRate(double annualInterestRate)
    {
      this.annualInterestRate = annualInterestRate;
    }
    
    public double getWithdraw()
    {
      return withdraw;
    }
    
    public void setWithdraw(double withdraw)
    {
      this.withdraw = withdraw;
    }
    
    public double getDeposit()
    {
      return deposit;
    }
    
    public void setDeposit(double deposit)
    {
       this.deposit = deposit;
    }
    
    public double getBalance()
    {
      return (this.balance - this.withdraw) + this.deposit;
    }
    
    public double getMonthlyInterestRate()
    {
      return (this.annualInterestRate/100)/12;
    }
    
    public double getMonthlyInterest()
    {
      return ((this.balance - this.withdraw) + this.deposit) * ((this.annualInterestRate/100)/12);
    }
    
    
    
      
    
    
    
     
    
     
    
     
}

