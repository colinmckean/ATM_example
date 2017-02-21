package atm;

public class User{

  private Wallet wallet;
  private Account account;

  public User(Wallet wallet, Account account){
    this.wallet = wallet;
    this.account = account;
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

}
