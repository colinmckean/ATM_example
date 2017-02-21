package atm;

public class User{

  private Wallet wallet;
  private Account account;
  private String name;

  public User(String name, Wallet wallet, Account account){
    this.wallet = wallet;
    this.account = account;
    this.name = name;

  }

  public int getWalletFunds(){
    return this.wallet.getTotalFunds();
  }

  public int getAccountBalance(){
    return this.account.getBalance();
  }

  public void makeDeposit(int amount){
    this.account.deposit(amount);
  }

  public void addFundsToWallet(int amount){
    this.wallet.addCash(amount);
  }

  public void userMakeTransactionDeposit(int amount){
    if(getWalletFunds() >= amount){
      addFundsToWallet(-amount);
      makeDeposit(amount);
    }else{
      System.out.println("no funds.");
    }
  }

  public void userMakeTransactionWithdraw(int amount, Atm atm){
    if(getAccountBalance() >= amount){
      System.out.println("HELLO?!");
      if(atm.canWithDrawMoney(amount)){
        System.out.println("HI");
        this.account.withdraw(amount);
        this.addFundsToWallet(amount);
      }else{
        System.out.println("nope");
      }
    }

  }
}
