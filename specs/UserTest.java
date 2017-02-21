import static org.junit.Assert.*;
import org.junit.*;
import atm.*;

public class UserTest {
User user;
Wallet wallet;
Account account;

  @Before
  public void before(){
    wallet = new Wallet();
    account = new Account();
    user = new User(wallet, account);
  }
  
  @Test
  public void testUserWalletHasFunds(){
    assertEquals(0, user.getWalletFunds());
  }
  @Test
  public void testUserAccountHasFunds(){
    assertEquals(0, user.getAccountBalance());
  }
}