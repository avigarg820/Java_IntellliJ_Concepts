package Day9.loosecouping;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String your_emailMessage) {
        //here you can write any code for email service, whatever you want
        System.out.println("Email message is : "+ your_emailMessage);
    }
}
