package Day9.loosecouping;

public class PushNotificationService implements NotificationService {
    @Override
    public void sendNotification(String pushmessage) {
        //here you can write any code for email service, whatever you want
        System.out.println("Push Notification Recieved with message : "+ pushmessage);
    }
}
