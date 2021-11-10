package com.example.thread;

/**
 * @author renfurui
 * @create -11-05-10:42
 */
public class ThreadTest {

    public static void main(String[] args) {
        Thread.currentThread().setName("main thread");
        Mythread mythread = new Mythread();
        mythread.setName("child thread:");
        mythread.start();
        System.out.println("main hello world");
    }

    //one way
    static class Mythread extends Thread {
        public void run(){
            System.out.println("hello world");
        }
    }
}
