package homeworks.homework03;

public class Animal {

    private String name;

    private int age;

    private double weigh;

    private String sex;

    private String type;

    public Animal() {}

    public Animal(String name, int age, double weigh, String sex, String type) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        this.sex = sex;
        this.type = type;
    }

    public Animal changeName(String newName) {
        this.name = newName;
        return this;
    }

    public static Animal birth(String name, double weigh, String sex, String type) {
        Animal animal = new Animal();
        animal.name = name;
        animal.age = 0;
        animal.weigh = weigh;
        animal.sex = sex;
        animal.type = type;
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
