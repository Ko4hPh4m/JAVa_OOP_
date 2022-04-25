package com.phenikaa;

public class Main {

    public static void main(String[] args) {
        new DigitalWatch();
        Banking acc = new Banking(8000);
        acc.display();
        Sender s = new Sender(acc);
        Receiver r = new Receiver(acc);
        s.t.start();
        r.t.start();
    }
}
