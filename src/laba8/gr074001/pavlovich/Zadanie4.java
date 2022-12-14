package laba8.gr074001.pavlovich;

import java.util.Scanner;

public class Zadanie4 {



    public static void summachisel() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1:");
        int a = scanner.nextInt();

        System.out.println("Введите число 2:");
        int b = scanner.nextInt();
        int c = a + b;

        System.out.println("Сумма:" + c);
    }
}


