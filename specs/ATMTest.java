import static org.junit.Assert.*;
import org.junit.*;
import atm.*;

public class ATMTest {
Atm atm;
Atm emptyAtm;

  @Before
  public void before(){
    atm = new Atm(1000);
    emptyAtm = new Atm(0);
  }
  @Test
  public void testBankHasMoney(){
    assertEquals(1000, atm.getCashReserves());
  }
}