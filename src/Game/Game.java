package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfGuesses = 0;
        DotCom dotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            System.out.print("Введите число: ");

            String guess = reader.readLine();
            String result = dotCom.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.printf("Вам потребовалось %d попыток(и)", numOfGuesses);
            }
        }
    }
}
