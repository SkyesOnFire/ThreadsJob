package com.company;

public class Contador1 implements Runnable {

    @Override
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("C1:" + i);
            try {
                Thread.sleep(250);
            }catch (InterruptedException ignored){}
        }
    }
}
