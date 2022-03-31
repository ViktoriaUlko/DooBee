import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        int y;
        do {
            System.out.println("Введите число от 0 до 10");
            y = s.nextInt();
            if (x > y) {
                System.out.println("Попробуй еще!");
            }
            if (x < y) {
                System.out.println("Не угадал. Попробуй еще!");
            }
        } while (x != y) ;
            System.out.println("Угадал!");
    }
}
