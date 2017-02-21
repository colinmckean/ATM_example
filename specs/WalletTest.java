import static org.junit.Assert.*;
import org.junit.*;
import atm.*;

public class WalletTest {
  
  Wallet wallet;

  @Before
  public void before(){
    wallet = new Wallet();
  }

  @Test
  public void testWalletIsEmpty(){
    assertEquals(0, wallet.getTotalFunds());
  }

  @Test
  public void testWalletAddFunds(){
    wallet.addCash(10);
    assertEquals(10, wallet.getTotalFunds());
  }
}