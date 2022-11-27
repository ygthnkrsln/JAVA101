package Software_Community.Course3_OOP2.FirstPart;

public class Person extends User{
    public Person(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void login() {
        System.out.println("Person login. ");
    }
}
