package com.example.prototypemodel;


import java.util.ArrayList;
import java.util.List;

/**
 * @author renfurui
 * @create -11-02-16:23
 */
public class Demo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);
    }

    private static void cloneAndCompare(List<Shape>shapes,List<Shape>shapescpoy){
        for(Shape shape:shapes){
            shapescpoy.add(shape.clone());
        }

        for(int i= 0;i < shapes.size();i++){
            if(shapes.get(i) != shapescpoy.get(i)){
                System.out.println("they are different objects");
                if(shapes.get(i).equals(shapescpoy.get(i))){
                    System.out.println("they are identical yay");
                }else{
                    System.out.println("they are not identical yay");
                }
            }else{
                System.out.println(i + "shape objects are the same!!!");
            }
        }
    }
}
