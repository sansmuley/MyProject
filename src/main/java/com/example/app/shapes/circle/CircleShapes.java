package com.example.app.shapes.circle;


import org.springframework.stereotype.Service;

@Service
public class CircleShapes {


    public double getArea(double radius){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(double radius){
        return 2*Math.PI*radius;
    }
}
