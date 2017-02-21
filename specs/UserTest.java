import static org.junit.Assert.*;
import org.junit.*;
import atm.*;

public class UserTest {

  User user;
  Wallet wallet;
  Wallet walletWithMoney;
  Account account;
  Atm atm;

  @Before
  public void before(){
    wallet = new Wallet();

    account = new Account();
    user = new User("Colin",wallet, account);
    atm = new Atm(1000);
  }

  @Test
  public void testUserWalletHasFunds(){
    assertEquals(0, user.getWalletFunds());
  }

  @Test
  public void testUserAccountHasFunds(){
    assertEquals(0, user.getAccountBalance());
  }
  @Test
  public void testUserCanDepost(){
    user.makeDeposit(10);
    assertEquals(10, user.getAccountBalance());
  }
  @Test
  public void testUserCanPutMoneyInWallet(){
    user.addFundsToWallet(10);
    assertEquals(10, user.getWalletFunds());
  }

  @Test
  public void testUserCanMakeDeposits(){
    user.addFundsToWallet(10);
    assertEquals(10, user.getWalletFunds());
    assertEquals(0, user.getAccountBalance());
    user.userMakeTransactionDeposit(10);
    assertEquals(0, user.getWalletFunds());
    assertEquals(10, user.getAccountBalance());
  }

@Test
  public void testUserCanMakeWithdraws(){
    user.addFundsToWallet(10);
    assertEquals(10, user.getWalletFunds());
    assertEquals(0, user.getAccountBalance());
    user.userMakeTransactionDeposit(10);
    assertEquals(10, user.getAccountBalance());
    assertEquals(0, user.getWalletFunds());
    user.userMakeTransactionWithdraw(10, atm);
    assertEquals(10, user.getWalletFunds());
    assertEquals(0, user.getAccountBalance());
  }
}