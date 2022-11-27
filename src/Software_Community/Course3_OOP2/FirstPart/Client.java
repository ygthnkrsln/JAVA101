package Software_Community.Course3_OOP2.FirstPart;

public class Client extends User{

    private String surname;

    public Client(String name, String email, String password, String surname) {
        super(name, email, password);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void login() {
        System.out.println("Client login. ");
    }
}
