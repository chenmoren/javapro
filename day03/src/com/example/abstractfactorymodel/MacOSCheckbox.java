package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:08
 */
public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("you have created MacOSCheckbox");
    }
}
