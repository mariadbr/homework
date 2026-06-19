package hw_1.ex_8;

public class NotificationService {
    private Sendable sender;

    public NotificationService(Sendable sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}
