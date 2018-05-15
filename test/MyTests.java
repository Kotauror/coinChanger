import org.junit.Assert;
import org.junit.Test;

public class MyTests {

    @Test
    public void coinChanger() {
        coinChanger tester = new coinChanger();
        // tests for 50 and 20 only
        Assert.assertEquals("case for 90",3, tester.coinChanger(90));
        Assert.assertEquals("case for 70",2, tester.coinChanger(70));
        Assert.assertEquals("case for 50",1, tester.coinChanger(50));
        Assert.assertEquals("case for 40",2, tester.coinChanger(40));
        Assert.assertEquals("case for 20",1, tester.coinChanger(20));
        // tests for 50, 20 and 10
        Assert.assertEquals("case for 60",2, tester.coinChanger(60));
        Assert.assertEquals("case for 80",3, tester.coinChanger(80));
        Assert.assertEquals("case for 80",2, tester.coinChanger(30));
        Assert.assertEquals("case for 80",1, tester.coinChanger(10));
    }
}


