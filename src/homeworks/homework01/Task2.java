package homeworks.homework01;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

//    public static void main(String[] args) {
//
//        Random random = new Random();
//        int petya = random.nextInt(3);
//        int vasya = random.nextInt(3);
//
//        System.out.println("камень-0, ножницы-1, бумага-2");
//
//        if (petya == vasya) {
//            System.out.println("Ничья!");
//        } else if ((petya == 0 && vasya == 1) || (petya == 1 && vasya == 2)) {
//            System.out.println("Выиграл Петя!");
//        } else {
//            System.out.println("Выиграл Вася!");
//        }
//
//    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int boy1, boy2;

        System.out.println("\nкамень-0, ножницы-1, бумага-2\n");

        for (; ; ) {
            boy1 = rnd.nextInt(3);
            boy2 = rnd.nextInt(3);

            System.out.println("Вася выбрал " + boy1);
            System.out.println("Петя выбрал " + boy2);

            if (boy1 == boy2) {
                System.out.println("Ничья. Ребята играют дальше.\n");
            } else if ((boy1 == 0 && boy2 == 1) || (boy1 == 1 && boy2 == 2) ||
                    (boy1 == 2 && boy2 == 0)) {
                System.out.println("Выиграл Вася.");
                break;
            } else {
                System.out.println("Выиграл Петя.");
                break;
            }
        }
    }

}
