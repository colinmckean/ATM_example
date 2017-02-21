package atm;

public class Account{
  private int accountBalance;
  public Account(){
    accountBalance = 0;
  }
  public int getBalance(){
    return accountBalance;
  }

  public void deposit(int deposit){
    accountBalance += deposit;
  }  
  public void withdraw(int amount){
    accountBalance -= amount;
  }
}