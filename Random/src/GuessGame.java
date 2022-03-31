import java.util.Scanner;

public class Myrandom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int javaInput = (int) (Math.random() * 10);
        int userInput;
        int tries = 0;
        System.out.println("Введи число от 0 до 10");
        do {
            userInput = s.nextInt();
            if (javaInput > userInput ) {
                tries = tries + 1;
                System.out.println("Подумай еще! Число должно быть больше. Попытка № " + tries);
            }
        }
    }
}



