package com.example.app.shapes.triangle;


import org.springframework.stereotype.Service;

@Service
public class TriangleShapes {


    public double getArea(double side1,double side2,double side3){
        double s = (side1 + side2 + side3) / 2; // Semiperimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(double side1,double side2,double side3) {
        return side1 + side2 + side3;
    }



}
