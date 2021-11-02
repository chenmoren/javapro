package com.example.abstractfactorymodel;

/**
 * @author renfurui
 * @create -11-02-10:14
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
