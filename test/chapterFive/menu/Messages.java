package chapterFive.menu;

public class Messages {

    public void writeMessages() {
        System.out.println("Write messages");
    }

    public void inbox() {
        System.out.println("Inbox");
    }

    public void outbox() {
        System.out.println("Outbox");
    }

    public void pictureMessages() {
        System.out.println("Picture messages");
    }

    public void templates() {
        System.out.println("Templates");
    }

    public void smileys() {
        System.out.println("Smileys");
    }

    public void messageSettings() {
        System.out.println("""
                                Message settings:
                                1. Set
                                2. Common
                                """);
    }

    public void set() {
        System.out.println("""
                                        Set:
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                        """);
    }

    public void common() {
        System.out.println("""
                                        Common:
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """);
    }

    public void messageCenterNumber() {
        System.out.println("Message centre number");
    }

    public void messageSentAs() {
        System.out.println("Messages sent as");
    }

    public void messageValidity() {
        System.out.println("Message validity");
    }

    public void deliveryReports() {
        System.out.println("Delivery reports");
    }

    public void replyViaSameCentre() {
        System.out.println("Reply via same centre");
    }

    public void characterSupport() {
        System.out.println("Character support");
    }

    public void infoService() {
        System.out.println("Info service");
    }

    public void voiceMailboxNumber() {
        System.out.println("Voice mailbox number");
    }

    public void serviceCommandEditor() {
        System.out.println("Service command editor");
    }
}
