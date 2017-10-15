
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

	@Test public void testSum() {
		StringCalculator Test = new StringCalculator();
        assertEquals(0, Test.add(" "));
		assertEquals(1, Test.add("1"));
		assertEquals(12, Test.add("2,5,5"));

		//assertEquals(100, Test.add("3,4,5,6,y,3"));
		assertEquals(6, Test.add("1\n2,3"));
    }
    @Test public void testNeg(){
        StringCalculator Test = new StringCalculator();
        RuntimeException exception = null;

        try {
            Test.add("3,-6,15,-9,46,-98,33");
        } catch (RuntimeException e) {
            exception = e;
        }
            assertNotNull(exception);
            assertEquals("Negatives not allowed: -6,-9,-98,", exception.getMessage());
    }

    @Test public void tooBig(){

        StringCalculator Test = new StringCalculator();

        assertEquals(32, Test.add("32,1001"));

    }

}
