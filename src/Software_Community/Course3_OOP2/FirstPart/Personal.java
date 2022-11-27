package Software_Community.Course3_OOP2.FirstPart;

public class Personal extends User{
    public Personal(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void login() {
        System.out.println(getName() + " login. ");
    }
}
