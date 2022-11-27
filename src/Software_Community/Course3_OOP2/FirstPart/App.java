package Software_Community.Course3_OOP2.FirstPart;

import Software_Community.Course3_OOP2.FirstPart.Interface.IUser;

public class App {

    public void method(User user) {
        user.login();
    }

    public void method2(IUser iUser) {
        iUser.getName("name");
    }

}
