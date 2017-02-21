package atm;

public class Atm{
  int cashReserves;
  int transactionLimit;

  public Atm(int cashReserves){
    this.cashReserves = cashReserves;
    this.transactionLimit = 250;
  }

  public int getCashReserves(){
    return cashReserves;
  }

  public void withDrawCash(int amount){
    if(cashReserves >= amount && amount <= transactionLimit){
      this.cashReserves -= amount;
    }
  }
  public void fillUp(int amount){
    this.cashReserves += amount;
  }
}