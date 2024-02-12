package com.example.app.shapes.Square;

import org.springframework.stereotype.Service;

@Service
public class SquareShapes {



    public double getArea(double side){

        return side*side;
    }

    public double getPerimeter(double side){
        return 2* side;
    }





}
