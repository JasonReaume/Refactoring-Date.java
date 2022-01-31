import static org.junit.Assert.*;
import org.junit.Test;

public class DateTest {

  @Test
  public void testGetMonth() {
    Date test = new Date();
    final int EXPECTED_MONTH = 1;
    assertEquals (EXPECTED_MONTH, test.getMonth());
  }
 
  @Test
  public void testGetDay() {
    Date test = new Date();
    final int EXPECTED_DAY = 1;
    assertEquals (EXPECTED_DAY, test.getDay());
  }

  @Test
  public void testGetYear() {
    Date test = new Date();
    final int EXPECTED_YEAR = 1000;
    assertEquals (EXPECTED_YEAR, test.getYear());
  }
}
