package Day9.tightcouping;

public class UserService {
// We want notification from user service
    NotificationService n = new NotificationService();

    public void NotifyUser(String message){
        n.sendNotification("sms message is "+ message);
        System.out.println("Above Message is from Notification Service TightCoupling");
        n.sendEmail("avigarg714@gmail.com with username");
    }

}
