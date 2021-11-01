package com.example1;

/**
 * @author renfurui
 * @create -08-30-23:12
 */
class Mthread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}



public class ThreadTest1 {
    public static void main(String[] args) {
        Mthread mthread = new Mthread();
        Thread t1 = new Thread(mthread);
        t1.start();
    }
}
