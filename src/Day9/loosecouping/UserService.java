package Day9.loosecouping;

public class UserService{
    /**
     * We 'll make reference of interface here
     * Here we don't make an object of notification service (interface here) unlike in tight coupling
     * We are just making constructor and passed param of interface type
     *
     */
    NotificationService notificationService;

    //Making constructor in beginning of the interface not any object yet
    //ensuring all implementations of interface can be passed and used in main class

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

//    public void NotifyUser(String username){
//        // here below in loosecoupling i'll use object of interface unlike
//        //we used {n} above which is object reference of Notification class
//        interface_notification.sendNotification("Order Placed for user "+ username);
//    }

    public void NotifyUser(String yourmessage){
        notificationService.sendNotification(yourmessage);
    }

}
