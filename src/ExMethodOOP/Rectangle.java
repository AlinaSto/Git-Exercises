package ExMethodOOP;

import java.awt.*;

public abstract class Rectangle implements Shape {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double computeArea(double height, double width){
      double ARectangle =  height * width;
        System.out.println("Aria dreptunghiului este" +ARectangle);
        return ARectangle;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
