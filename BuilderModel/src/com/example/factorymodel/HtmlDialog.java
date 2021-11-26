package com.example.factorymodel;

/**
 * @author rfr
 * @create 2021-11-01 22:20
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
