package Day3.inheritance;

public class Vehicle {
    private String brand;
    private int speed;
    //both above private properties so only getters used.

    public Vehicle(String brand, int speed) {
        this.speed = speed;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //making a method
    public  void displayInfo(){
        System.out.println("Brand: " + brand +", Speed: " + speed + "kmph");
    }
}
