package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author renfurui
 * @create -11-03-20:20
 */


//one way
class Mythread extends Thread {
    public Mythread(){

    }
    public void run(){
        System.out.println("hello world");
    }
}

//two way
class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("hello world1");
    }
}

//three way
class MyThread2 implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("hello world2");
        return "hello world2";
    }
}

//four way


public class Demo {

    public static  void main(String[] args) throws ExecutionException, InterruptedException {
        //one way
        Mythread t1 = new Mythread();
        t1.start();

        //two way
        MyThread1 myThread1 = new MyThread1();
        Thread t2 = new Thread(myThread1);
        t2.start();

        //three way
        MyThread2 myThread2 = new MyThread2();
        FutureTask futureTask = new FutureTask(myThread2);   //增加线程需要新创建FutureTask对象
        FutureTask futureTask1 = new FutureTask(myThread2);
        Thread t3 = new Thread(futureTask);
        t3.start();
        Thread t4 = new Thread(futureTask1);
        t4.start();
        System.out.println((String) futureTask.get());
    }
}
