package homeworks.homework02;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Исходная строка: ");
        String inputString = scanner.next();

        int count = 8;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            stringBuilder.append(inputString);
        }

        System.out.println("Repeat = " + inputString.repeat(count));
        System.out.println("StringBuilder = " + stringBuilder);
    }

}
