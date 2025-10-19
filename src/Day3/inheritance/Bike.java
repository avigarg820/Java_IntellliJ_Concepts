package Day3.inheritance;

public class Bike extends Vehicle {
    private Boolean HasCarrier;

    public Bike(String brand, int speed, boolean HasCarrier) {
        super(brand, speed);
        this.HasCarrier = HasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //default behaviour from vehivle class
        System.out.println("Brand is "+ getBrand()+ ", Speed is "+ getSpeed() + " with "+ HasCarrier + "Hascarrier");
//        above is new defined behaviour of child class using ovveride, u can also comment out default behaviour
    }
}
