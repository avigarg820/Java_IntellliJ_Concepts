package Day3.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1= new Car("Toyota", 200, 4);
        c1.displayInfo();

        //obj of bike class
        Bike b1 = new Bike("Suzuki", 160, true);
        b1.displayInfo();
    }
}
