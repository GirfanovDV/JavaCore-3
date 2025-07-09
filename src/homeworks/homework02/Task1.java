package homeworks.homework02;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите степень в градусах Фаренгейта: ");
        double farenheit = scanner.nextDouble();
        double celsius = (farenheit - 32) * 5 / 9;

        System.out.println(farenheit + " градусов по Фаренгейту равна " + celsius + " по Цельсию");
    }

}
