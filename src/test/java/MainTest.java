import org.example.Main;
import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    Main main = new Main();
    
    @Test
    public void testRoot1() {
        Double x = Main.squareRootHelper(4);
        Assert.assertEquals(x, 2.0, 1e-10);
    }

    @Test
    public void testRoot2() {
        Double x = Main.squareRootHelper(8);
        Assert.assertEquals(x, 2.828, 1e-10);
    }

    @Test
    public void testFact1() {
        int x = Main.factorialHelper(4);
        Assert.assertEquals(x, 24);
    }

    @Test
    public void testFact2() {
        int x = Main.factorialHelper(5);
        Assert.assertEquals(x, 120);
    }

    @Test
    public void testLog1() {
        Double x = Main.naturalLogHelper(10);
        Assert.assertEquals(x, 2.303, 1e-10);
    }

    @Test
    public void testLog2() {
        Double x = Main.naturalLogHelper(5);
        Assert.assertEquals(x, 1.609, 1e-10);
    }

    @Test
    public void testPower1() {
        int x = Main.powerHelper(4, 2);
        Assert.assertEquals(x, 16);
    }

    @Test
    public void testPower2() {
        int x = Main.powerHelper(4, 3);
        Assert.assertEquals(x, 64);
    }
}