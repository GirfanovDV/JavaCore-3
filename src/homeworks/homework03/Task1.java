package homeworks.homework03;

public class Task1 {

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.changeName("Мурка");

        Animal dog = Animal.birth("Шарик", 0.2, "кобель", "Йоркширский терьер");

        System.out.println(dog);

        System.out.println(cat);
    }

}
