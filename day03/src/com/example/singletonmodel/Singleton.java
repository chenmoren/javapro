package com.example.singletonmodel;

/**
 * @author renfurui
 * @create -11-01-18:08
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if(result != null){
            return result;
        }
        //线程同步  多线程使用时安全
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
