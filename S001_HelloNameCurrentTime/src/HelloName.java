/*
Написать программу, которая запросит пользователя ввести <Имя> в консоли,
получит введенную строку и выведет в консоль сообщение «Привет, <Имя>!»
 */

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
    }
}