package com.company;

public class Fio implements Runnable {

    public static int cont = 0;
    private final String id;
    private static boolean occupied;

    public Fio(String id) {
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Thread " + id);
        for (int i=0; i<100_000; ++i){
            while (!occupied){
                occupied = true;
                cont++;
                occupied = false;
            }
        }
    }
}
