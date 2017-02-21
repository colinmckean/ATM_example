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
  public void accountBalance(){
    assertEquals(0,account.getBalance());
  }
}