package com.example.threadWay;

/**
 * @author renfurui
 * @create -11-08-15:09
 */
public class joinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest t1 = new ThreadTest("t1");
        ThreadTest t2 = new ThreadTest("t2");
        t1.start();
        t1.join();     //join会将主线程阻塞 直到t1线程结束
        t2.start();
    }
}


class ThreadTest extends Thread{
    private String name;
    ThreadTest(String name){
        this.name = name;
    }
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "-" +i);
        }
    }
}
