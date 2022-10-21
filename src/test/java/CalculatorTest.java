import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends TestBase {

    @Test
    public void calculateTest() {
        pageHelper.openGoogle();
        pageHelper.openCalculator();
        Assert.assertEquals("0", pageHelper.calculate());
        Assert.assertEquals("1 × 2 - 3 + 1 =", pageHelper.getMemory());
    }
}
