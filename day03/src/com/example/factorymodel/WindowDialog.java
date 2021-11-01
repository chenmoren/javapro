package com.example.factorymodel;

/**
 * @author rfr
 * @create 2021-11-01 22:22
 */
public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
