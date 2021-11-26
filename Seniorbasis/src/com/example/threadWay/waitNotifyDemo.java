package com.example.threadWay;

/**
 * @author renfurui
 * @create -11-10-20:21
 */
public class waitNotifyDemo {
    static Object o1 = new Object();

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        System.out.println("b thread is start");
        synchronized (o1){

        }
    }
}


class ThreadB extends Thread{

}
