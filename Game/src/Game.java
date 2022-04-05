import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberRandom = (int) (Math.random() * 10);
        int numberUser;
        int numberTry = 1;
        System.out.println("Я загалала число от 0 до 10. У тебя есть 5 попыток отгадать его.");
        do {
            numberTry = numberTry + 1;
            numberUser = s.nextInt();
            if (numberRandom > numberUser) {
                System.out.println("Подумай еще! Число должно быть больше. Попытка № " + numberTry);
            }
            if (numberRandom < numberUser) {
                System.out.println("Подумай еще! Число должно быть меньше. Попытка № " + numberTry);
            }
        } while (numberRandom != numberUser && numberTry != 6);
        if (numberTry == 6) {
            System.out.println("Попытки закончились. Ты проиграл!");
        }
        if (numberRandom == numberUser) {
            System.out.println("С попытки № " + numberTry + " ты угадал!");
        }
    }
}
