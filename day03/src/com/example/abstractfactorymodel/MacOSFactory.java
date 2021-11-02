package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:12
 */
public class MacOSFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
