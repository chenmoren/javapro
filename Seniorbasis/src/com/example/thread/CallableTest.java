package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author renfurui
 * @create -11-05-10:49
 */
public class CallableTest {

    static class MyCallable implements Callable{
        @Override
        public Object call() throws Exception {
            System.out.println("child hello world");
            return "child send to main hello world";
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //执行Callable 方式，需要FutureTask 实现实现，用于接收运算结果
        FutureTask futureTask = new FutureTask(new MyCallable());
        Thread thread = new Thread(futureTask);
        thread.start();
        //接受子线程结果
        String childstr = (String) futureTask.get();
        System.out.println(childstr);

    }
}
