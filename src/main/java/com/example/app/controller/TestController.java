package com.example.app.controller;

import com.example.app.service.CalculateShapes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    CalculateShapes calculateShapes;

    @GetMapping(path="/circle-area/{radius}")
    public String getCircleArea(@PathVariable double radius){

        double circleArea = calculateShapes.calculateCircleArea(radius);
        String s1 = "Area of Circle is "+ circleArea;
        return s1;


    }



    @GetMapping(path="/triangle-perimeter")
    public String getTrianglePerimeter(){

        double trianglePerimeter = calculateShapes.calculateTrianglePerimeter();
        String t1 = "Perimeter of Triangle is "+ trianglePerimeter;
        return t1;


    }

    @GetMapping(path="/square-area")
    public String getSquareArea() {


        // this will  calculate square area
        double squareArea = calculateShapes.calculateSquareArea();
        String sq1 = "Area of Square is " + squareArea;
        return sq1;
    }

    @GetMapping(path="/rectangle-perimeter")
    public String getRectanglePerimeter(){

        double rectanglePerimeter = calculateShapes.calculateRectanglePerimeter();
        String rec = "Perimeter of Rectangle is"+rectanglePerimeter;
        return rec;
    }
}
