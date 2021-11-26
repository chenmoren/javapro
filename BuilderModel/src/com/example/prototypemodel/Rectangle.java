package com.example.prototypemodel;

import java.util.Objects;

/**
 * @author renfurui
 * @create -11-02-16:43
 */
public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(){

    }
    public Rectangle(Rectangle target){
        super(target);
        width = target.width;
        height = target.height;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public boolean euqals(Object object){
        if(!(object instanceof Rectangle) || !super.equals(object)) return false;
        return ((Rectangle) object).width == width && ((Rectangle) object).height == height;
    }
}
