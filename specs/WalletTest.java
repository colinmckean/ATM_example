import static org.junit.Assert.*;
import org.junit.*;
import atm.*;

public class WalletTest {
Wallet wallet;
Wallet emptyAtm;

  @Before
  public void before(){
    wallet = new Wallet();
  }
  @Test
  public void testWalletIsEmpty(){
    assertEquals(0, wallet.getTotalFunds());
  }
}