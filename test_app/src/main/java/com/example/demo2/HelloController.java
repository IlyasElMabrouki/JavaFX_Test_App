package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle mycircle;
    private double x,y;

    public void up(){
        //System.out.println("UP");
        mycircle.setCenterY(y-=10);
    }

    public void left(){
        //System.out.println("LEFT");
        mycircle.setCenterX(x-=10);
    }

    public void right(){
        //System.out.println("RIGHT");
        mycircle.setCenterX(x+=10);
    }

    public void down(){
        //System.out.println("DOWN");
        mycircle.setCenterY(y+=10);
    }
}