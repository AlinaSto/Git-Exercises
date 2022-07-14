package ExMethodOOP;

import java.awt.*;

public abstract class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea(double radius){
       double ACircle = 3.14 * (radius * radius);
       return ACircle;

    }
}
