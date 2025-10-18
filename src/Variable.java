import java.util.Arrays;

public class Variable {
    public static void main(String[] args) {
//        int a=10;
//        int age = 25;
//        String name = "Avi";
//        name = "user";
//
//        System.out.println(STR."Hello from \{name}. I am \{age} years old. Welcome!!");
/**
 * used string template to print tests and variables
 *
 */
        String DoctorName = "Avi Garg";
        String PatientName = "Lakhwinder Singh";
        String[] Tests ={"CBC", "OT/PT", "MP"};

        System.out.println(STR."Hello from Dr.\{DoctorName} performing tests like \{String.join(",", Tests)}for patient \{PatientName}");
    }
}
