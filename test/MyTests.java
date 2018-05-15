import org.junit.Assert;
import org.junit.Test;

public class MyTests {

    @Test
    public void coinChanger() {
        coinChanger tester = new coinChanger();
        Assert.assertNotNull(tester.coinChanger(95));
        Assert.assertEquals("case for 90",3, tester.coinChanger(90));

//        Assert.assertEquals("list of coins is empty at the beginning",0, coinChanger.listOfCoins.size());
//        Assert.assertEquals("add 50 to the list when number equal or bigger to 50",[50], coinChanger.listOfCoins.size());

//        System.out.println(list);
    }
}


