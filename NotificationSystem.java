interface Notifications {
    void sendMessages(String message);
}
class MobileNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Mobile Notification: " + message);
    }
}

class EmailNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class JobNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Job Notification: " + message);
    }
}

class WhatsAppNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("WhatsApp Notification: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        MobileNotification md = new MobileNotification();
        EmailNotification ed = new EmailNotification();
        JobNotification jd = new JobNotification();
        WhatsAppNotification wd = new WhatsAppNotification();
        md.sendMessages("You have a new mobile message!");
        ed.sendMessages("You have a new email!");
        jd.sendMessages("New Java Developer job available!");
        wd.sendMessages("You received a WhatsApp message!");
    }
}