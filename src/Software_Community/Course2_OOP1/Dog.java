package Software_Community.Course2_OOP1;

public class Dog extends Animal {

    private boolean hasTail;

    public Dog(String name, int length, double weight, int legCount, boolean isWalking, boolean hasTail) {
        super(name, length, weight, legCount, isWalking);
        this.hasTail = hasTail;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public void walk() {
        System.out.println("Dog is walking");
    }

}
