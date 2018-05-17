import java.util.ArrayList;

public class coinChanger {

    public int coinChanger(int number) {

        ArrayList<Integer> listOfCoins = new ArrayList<>();

        while  (number > 0) {
            if (number >= 50 ) {
                listOfCoins.add(50);
                number -= 50;
            }
            while (number >= 20) {
                listOfCoins.add(20);
                number -= 20;
            }
            while (number >= 10) {
                listOfCoins.add(10);
                number -= 10;
            }
        }

        return listOfCoins.size();
    }
}



