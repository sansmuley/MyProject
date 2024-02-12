package com.example.app.shapes.rectangle;


import org.springframework.stereotype.Service;

@Service

public class RectangleShapes {


    public double getArea(double length,double width){

        return length * width;
    }

    public double getPerimeter(double length,double width){

        return 2*(length+width);
    }




}
