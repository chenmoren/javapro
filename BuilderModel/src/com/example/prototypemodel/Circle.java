package com.example.prototypemodel;

import java.util.Objects;

/**
 * @author renfurui
 * @create -11-02-16:37
 */
public class Circle extends Shape{
    public int radius;
    public Circle(){
    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public boolean equals(Object object){
        if(!(object instanceof Circle) || !super.equals(object)) return false;
        return this.radius == ((Circle) object).radius;
    }
}
