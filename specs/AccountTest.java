import static org.junit.Assert.*;
import org.junit.*;
import atm.*;

public class AccountTest {
  
  Account account;

  @Before
  public void before(){
    account = new Account();
  }

  @Test
  public void testAccountBalance(){
    assertEquals(0,account.getBalance());
  }

  @Test
  public void testAccountDeposit(){
    account.deposit(100);
    assertEquals(100,account.getBalance());
  }

  @Test
  public void testReduceBalance(){
    account.deposit(100);
    account.withdraw(10);
    assertEquals(90,account.getBalance());
  }

  @Test
  public void testCantGoInNegitiveBalance(){
    account.deposit(10);
    account.withdraw(20);
    assertEquals(10, account.getBalance());

  }
}