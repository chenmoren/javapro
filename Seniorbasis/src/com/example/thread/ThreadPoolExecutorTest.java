package com.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author renfurui
 * @create -11-05-10:55
 */
public class ThreadPoolExecutorTest {

    static class ThreadPool implements Runnable{
        @Override
        public void run() {
            System.out.println("child thread :"+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ThreadPool threadPool = new ThreadPool();

        for(int i = 0;i<5;i++){
            executorService.execute(threadPool);   //适用于runnable
            executorService.submit(threadPool);   //适用于callable

        }
        executorService.shutdown();
    }
}
