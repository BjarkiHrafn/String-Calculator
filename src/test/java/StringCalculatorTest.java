
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    
	@Test public void testSum() {
		StringCalculator Test = new StringCalculator();
        assertEquals(0, Test.add(" "));
		assertEquals(1, Test.add("1"));
    }
	
}