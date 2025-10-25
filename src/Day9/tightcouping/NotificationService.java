package Day9.tightcouping;

public class NotificationService {
    public void sendNotification(String message) {
        System.out.println("Notification with message: "+ message);
    }
    public void sendEmail(String email){
        System.out.println("Mail for Employment sent to "+ email);
    }
}
