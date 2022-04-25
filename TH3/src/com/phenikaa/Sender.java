package com.phenikaa;

import java.util.Scanner;
import java.lang.Thread;

class Sender implements Runnable {
    Banking acc;
    Thread t;
    public Scanner scanner = new Scanner(System.in);

    Sender(Banking acc){
        this.acc = acc;
        t = new Thread(this,"Sender");
    }
    @Override
    public void run() {
        while(true){
            int tienNap = scanner.nextInt();
            acc.napTien(tienNap);
        }
    }
}
class Receiver implements Runnable{
    public Scanner scanner = new Scanner(System.in);
    Banking acc;
    int tienRut;
    Thread t;
    Receiver(Banking acc){
        this.acc = acc;
        t = new Thread(this, "Receiver");
    }
    public void run(){
        while(true){
            int tienRut = scanner.nextInt();
            acc.rutTien(tienRut);
        }
    }
}

