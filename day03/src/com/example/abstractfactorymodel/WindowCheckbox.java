package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:10
 */
public class WindowCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("you have created WindowCheckbox");
    }
}
