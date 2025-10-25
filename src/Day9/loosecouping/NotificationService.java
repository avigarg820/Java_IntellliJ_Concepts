package Day9.loosecouping;

/**
 * 1. Interface definition
 * 2. It says if you have to implement any kind of definition of Notification(Email, Sms, Push)in your app, Use this template
 */
public interface NotificationService {
    void sendNotification(String message);
}
