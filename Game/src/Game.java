import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        int y;
        int z = 0;
        do {
            System.out.println("Введите число от 0 до 10");
            y = s.nextInt();
            if (x > y) {z = z + 1;
                System.out.println("Подумай еще! Число должно быть больше. Попытка № " + z);
            }
            if (x < y) {z = z + 1;
                System.out.println("Попробуй еще раз, число должно быть меньше. Попытка № " + z);
            }
        } while (x != y) ;
        z = z + 1;
            System.out.println("С попытки № " + z + " ты угадал ");
    }
}
