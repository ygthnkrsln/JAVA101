package Software_Clup_Course.Course2_OOP1;

public class Course2 {
    public static void main(String[] args) {

        Animal animal = new Animal("name", 130, 80, 4, false);
        Animal animal2 = new Animal("name", 130, 80, 4, false);

        Dog dog = new Dog("Köpek", 100, 30, 4, true, true);

        dog.walk();

        if (animal.equals(animal2)) System.out.println("\nYes");
        else System.out.println("\nNo");
    }
}
