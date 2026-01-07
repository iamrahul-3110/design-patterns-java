package org.rahul.SOLIDPrinciples.DIP.GoodCode;


public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService()); // creating dependency outside the class for better flexibility
        emailNotification.notify("Your order has been shipped");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("OTP 1234");
    }
}
