package com.company;

public class Contador2 implements Runnable {

    @Override
    public void run(){
        for (int i=1; i<=20; i++){
            System.out.println("   C2:" + i);
            try {
                Thread.sleep(250);
            }catch (InterruptedException ignored){}
        }
    }
}
