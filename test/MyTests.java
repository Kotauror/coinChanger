import org.junit.Assert;
import org.junit.Test;

public class MyTests {

    @Test
    public void coinChanger() {
        coinChanger tester = new coinChanger();
        Assert.assertEquals(5, tester.coinChanger(5));
    }
}


