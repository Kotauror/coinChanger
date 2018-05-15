import java.util.ArrayList;

public class coinChanger {

    public int coinChanger(int number) {

        ArrayList<Integer> listOfCoins = new ArrayList<>();

        while(number > 0) {
            if (number >= 50 ) {
                System.out.println("number - 50");
                listOfCoins.add(50);
                number -= 50;
                System.out.println(listOfCoins);

            }
            while (number >= 20) {
                System.out.println("number - 20");
                listOfCoins.add(20);
                number -= 20;
                System.out.println(listOfCoins);
                System.out.println(number);
            }
        }
        System.out.println(number);
        return listOfCoins.size();
    }
}


