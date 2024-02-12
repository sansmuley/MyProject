package com.example.app.service;

import com.example.app.shapes.Square.SquareShapes;
import com.example.app.shapes.circle.CircleShapes;
import com.example.app.shapes.rectangle.RectangleShapes;
import com.example.app.shapes.triangle.TriangleShapes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateShapes {

    @Autowired
    CircleShapes c1 ;

    public double calculateCircleArea(double radius){


        double area = c1.getArea(radius);

        return area;


    }

    @Autowired
    TriangleShapes t1;

    public double calculateTrianglePerimeter(){


        double perimeter = t1.getPerimeter(4,5,6);
        return perimeter;
    }

    @Autowired
    SquareShapes sq1;

    public  double calculateSquareArea(){

        double area = sq1.getArea(9);
        return area;
    }

    @Autowired
    RectangleShapes rec;

    public double calculateRectanglePerimeter(){

        double perimeter = rec.getPerimeter(7,4);
        return perimeter;
    }
}
