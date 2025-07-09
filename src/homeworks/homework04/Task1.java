package homeworks.homework04;

public class Task1 {

    public static void main(String[] args) {

        char input = 'q';

        String string = "qwertyuiopasdfghjklzxcvbnm";

        if (string.indexOf(input) == 0) {
            System.out.println(string.charAt(string.length() - 1));
        }

    }
}
