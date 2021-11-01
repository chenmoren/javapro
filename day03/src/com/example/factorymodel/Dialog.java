package com.example.factorymodel;

/**
 * @author rfr
 * @create 2021-11-01 22:17
 */
public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
