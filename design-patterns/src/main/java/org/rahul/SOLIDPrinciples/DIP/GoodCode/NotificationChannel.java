package org.rahul.SOLIDPrinciples.DIP.GoodCode;

public interface NotificationChannel {
    void send(String msg); // Used for decoupling the high-level module from low-level modules ( Dependency Inversion Principle )
}
