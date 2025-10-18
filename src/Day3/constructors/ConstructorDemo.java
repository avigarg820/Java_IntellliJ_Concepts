package Day3.constructors;

public class ConstructorDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Emrald Green", 130);
//        car1.brand = "Audi";
//        car1.speed = 130;
//        car1.color = "Emerald Peacock";
        car1.drive();

        System.out.println();
        System.out.println();

        // creating car 2 : same template
        Car car2 = new Car("Toyota", "Copper", 150);
//        car2.brand = "Audi";
//        car2.speed = 130;
//        car2.color = "Emerald Peacock";
        car2.drive();
    }
}
