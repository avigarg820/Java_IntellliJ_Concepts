package Day3.constructors;

public class Car {
    String brand;
    String color;
    int speed;

    /*
    Added Constructors to see their working in bts
    1. More flexibility, 2. No Tension of No of Params and
    -> reduced No of code lines for assigning values to properties of objs
     */
    // Default Constructor is below, later we made parameterized to promote dynamicity.---------------

//    public Car(){
//        System.out.println("Constructor Called");
//        //i have not mentioned the type of parameters for def. constructor.
//        brand = "Audi Default";
//        color = "Red Default";
//        speed = 200;
//    }
    //default constructor ends here------------------------------------------------------------------------

    /***
     * Above is the hard-coded connstructor which is not dynamic.
     * To achive dynamicity, we will pass parameters soit'll auto pick them
     * Check it Below: new Parameterized Constructor
     * And we used this because we want to assign passed paramter value to the property of class]
     * As this represents current instance of class and property is classe's brand, color, speed]
     */

    public Car(String brand , String color, int speed){
        System.out.println("Constructor Called");
        //i have not mentioned the type of parameters for def. constructor.
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand+"'s Car is running at "+ speed + " kmph with color "+ color);
    }
}
