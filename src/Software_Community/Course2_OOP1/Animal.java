package Software_Community.Course2_OOP1;

public class Animal {

    // fields
    private String name;
    private int length;
    private double weight;
    private int legCount;
    private boolean isWalking;


    // constructor
    public Animal(String name, int length, double weight, int legCount, boolean isWalking) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.legCount = legCount;
        this.isWalking = isWalking;
    }


    // methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
    }

    public void walk() {
        System.out.println("Animal is walking");
    }

    @Override
    public boolean equals(Object obj) {
        Animal ref = (Animal) obj;
        return ref.name == name;
    }
}
