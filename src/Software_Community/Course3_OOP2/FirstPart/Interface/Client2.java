package Software_Community.Course3_OOP2.FirstPart.Interface;

public class Client2 implements IUser {

    @Override
    public void getName(String name) {
        System.out.println(name);
        getSurname("surname");
    }



}
