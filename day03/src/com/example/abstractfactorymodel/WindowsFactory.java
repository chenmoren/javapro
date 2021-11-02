package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:13
 */
public class WindowsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowCheckbox();
    }
}
