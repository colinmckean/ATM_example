package atm;

public class Wallet{
  int funds;

  public Wallet(){
    funds = 0;
  }

  public int getTotalFunds(){
    return this.funds;
  }
  public void addCash(int amount){
    funds += amount;
  }
}