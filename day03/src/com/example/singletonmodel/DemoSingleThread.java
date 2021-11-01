package com.example.singletonmodel;

/**
 * @author renfurui
 * @create -11-01-17:53
 */


public class DemoSingleThread {
    public static void main(String[] args) {

        Singleton singleton  = Singleton.getInstance("hello");
        Singleton anothersingleton = Singleton.getInstance("world");
        System.out.println(singleton.value);
        System.out.println(anothersingleton.value);
    }
}
