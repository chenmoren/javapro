package com.example.prototypemodel;

import java.util.Objects;

/**
 * @author renfurui
 * @create -11-02-16:32
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){

    }
    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract Shape clone();

    public boolean equals(Object object){
        if(!(object instanceof Shape)) return false;
        Shape shape = (Shape) object;
        return shape.x == ((Shape) object).x && shape.y==((Shape) object).y
                && Objects.equals(shape.color,((Shape) object).color);
    }
}
