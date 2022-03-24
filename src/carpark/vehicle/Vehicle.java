package carpark.vehicle;

public class Vehicle {
    private int size;
    private String name;
    public static final int big = 3;
    public static final int medium = 2;
    public static final int small = 1;

    @Override
    public String toString() {
        return "Vehicle{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public Vehicle(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
