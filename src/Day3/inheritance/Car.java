package Day3.inheritance;

//now car class has to inherit the vehicle class
public class Car extends Vehicle{
    int doors;

    public Car(String brand, int speed, int doors ) {
        // we using super to call parent constructor in case properties are private
        //you can initialise here but u won't have access to private prperties of vehicle class
        super(brand, speed);
        this.doors = doors;
    }

    //if this class wants new displayinfo() not parents. use ovverride

    @Override
    public void displayInfo() {
        super.displayInfo(); //default behaviour
        System.out.println("Brand is "+ getBrand()+ ", Speed is "+ getSpeed() + " with "+ doors+ " doors");
        System.out.println("Calling from car class's overide displaymethod");
        //above lines are new behaviour defined in child class and used after override
    }
}
