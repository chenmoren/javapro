package com.example.factorymodel;

/**
 * @author rfr
 * @create 2021-11-01 21:56
 */
public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Window 10")){
            dialog = new HtmlDialog();
        }else{
            dialog = new WindowDialog();
        }
    }
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
