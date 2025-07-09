package homeworks.homework04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        Pattern pattern = Pattern.compile(">>-->");
        Matcher matcher = pattern.matcher(input);

        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);
    }
}
