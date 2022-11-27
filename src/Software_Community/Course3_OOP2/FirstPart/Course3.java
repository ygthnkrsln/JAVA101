package Software_Community.Course3_OOP2.FirstPart;

import Software_Community.Course3_OOP2.FirstPart.Interface.Client2;
import Software_Community.Course3_OOP2.FirstPart.Interface.IUser;

public class Course3 {
    public static void main(String[] args) {

//        Client client = new Client("name", "email@email.com", "123", "surname");
//        client.login();
//
//        Personal personal = new Personal("Personal", "email@email.com", "123");
//        personal.login();
//
//        Person person = new Person("name", "email@email.com", "123");
//        person.login();

        User user = new Client("Client", "email", "password", "surname");
        User user2 = new Person("Person","email", "password");

        Client client = new Client("Client", "email", "password", "surname");

        App app = new App();
        app.method(user);
        app.method(user2);
        app.method(client);

        IUser iUser = new Client2();
        app.method2(iUser);

    }
}
