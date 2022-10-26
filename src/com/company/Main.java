package com.company;

public class Main {

    public static void main(String[] args) {
	    Thread thread1 = new Thread(new Fio("1"));
	    Thread thread2 = new Thread(new Fio("2"));
	    Thread thread3 = new Thread(new Fio("3"));
	    Thread thread4 = new Thread(new Fio("4"));
        thread1.start();
        try{
            thread1.join();
        }catch (InterruptedException ignored){}
        thread2.start();
        try{
            thread2.join();
        }catch (InterruptedException ignored){}
        thread3.start();
        try{
            thread3.join();
        }catch (InterruptedException ignored){}
        thread4.start();
        try{
            thread4.join();
        }catch (InterruptedException ignored){}
        System.out.println(Fio.cont);
    }
}
