import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberPC = new Random().nextInt(10);
        int numberUser;
        int triesLimit = 5;
        int tries = 0;
        boolean isWin = true;
//        чтобы знать что загадал комп
//        System.out.println(numberPC);
        System.out.println("Введите число от 0 до 10");
        do {
            numberUser = s.nextInt();
            tries++;
            if (tries == triesLimit) {
                isWin = false;
                break;
            }
            if (numberPC > numberUser) {
                System.out.println("Подумай еще! Число должно быть больше. Количество оставшихся попыток "
                        + (triesLimit - tries));
            }
            if (numberPC < numberUser) {
                System.out.println("Попробуй еще раз, число должно быть меньше. Количество оставшихся попыток "
                        + (triesLimit - tries));
            }
        } while (numberPC != numberUser);
        if (isWin) {
            System.out.println("С попытки № " + tries + " ты угадал ");
        } else {
            System.out.println("Попытки закончились))) Ты - тормоз!");
        }
    }
}
