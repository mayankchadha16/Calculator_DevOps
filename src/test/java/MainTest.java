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
    public void testLog() {
        Double x = Main.naturalLogHelper(10);
        Assert.assertEquals(x, 2.303, 1e-10);
    }
}