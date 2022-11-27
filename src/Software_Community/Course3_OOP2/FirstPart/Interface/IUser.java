package Software_Community.Course3_OOP2.FirstPart.Interface;

public interface IUser {

    void getName(String name);

    default void getSurname(String surname) {
        System.out.println(surname);
    }

}
