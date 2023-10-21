import org.example.Main;
import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    @Test
    public void testRoot() {
        Double x = Main.squareRootHelper(4);
        Assert.assertEquals(x, 2.0, 1e-10);
    }

    @Test
    public void testFact() {
        int x = Main.factorialHelper(4);
        Assert.assertEquals(x, 24);
    }

    @Test
    public void testLog() {
        Double x = Main.naturalLogHelper(10);
        Assert.assertEquals(x, 2.303, 1e-10);
    }

    @Test
    public void testPower() {
        int x = Main.powerHelper(4, 2);
        Assert.assertEquals(x, 16);
    }
}