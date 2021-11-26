package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:04
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("you have created MacOSButton");
    }
}
