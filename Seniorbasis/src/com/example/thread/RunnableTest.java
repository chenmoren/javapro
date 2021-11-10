package com.example.thread;

/**
 * @author renfurui
 * @create -11-05-10:47
 */
public class RunnableTest {
    class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("child hello world");
        }
    }
    public static void main(String[] args) {
        Thread.currentThread().setName("main thread:");
        Thread thread = new Thread(new Mythread());
        thread.start();
        System.out.println("main hello world");
    }
}
