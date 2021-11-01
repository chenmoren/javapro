package com.example1;

/**
 * @author renfurui
 * @create -08-30-22:42
 */

class Window extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            if(ticket >0 ){
                System.out.println(getName() + ": 卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }

        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.start();
        w2.start();
        w3.start();
    }
}
