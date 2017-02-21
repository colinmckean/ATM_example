package atm;

public class Atm{
  int cashReserves;

  public Atm(int cashReserves){
    this.cashReserves = cashReserves;
  }

  public int getCashReserves(){
    return cashReserves;
  }
  
  public void withDrawCash(int amount){
    if(cashReserves >= amount){
      this.cashReserves -= amount;
    }
  }
}