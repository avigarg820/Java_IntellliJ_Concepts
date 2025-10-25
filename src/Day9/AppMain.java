package Day9;
// this class is common not in tight and not in loose.
import Day9.loosecouping.EmailNotificationService;
import Day9.loosecouping.NotificationService;
import Day9.loosecouping.PushNotificationService;
import Day9.tightcouping.UserService;

public class AppMain {
    public static void main(String[] args) {

        //Tight Coupling example below:--
//        UserService user1 = new UserService();
//        user1.NotifyUser("Message from tight coupling");

        // Loose Coupling example now:- also called Strategy Design pattern
        NotificationService emailnotify = new EmailNotificationService();
        NotificationService pushnotify = new PushNotificationService();
        Day9.loosecouping.UserService user2 = new Day9.loosecouping.UserService(pushnotify);
        user2.NotifyUser("Joining  at Bengaluru JP MORGAN IN NOVEMEBER 2025");

    }





}
