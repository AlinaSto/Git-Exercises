package OOPMethodsShapesCircleRect;

import java.util.Scanner;

public class Canvas {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Introdu valoarea pentru raza cercului");
        double radius = console.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Aria cercului este "+circle.computeArea());
        System.out.println("Introdu valorile pentru:");
        System.out.println("Inaltimea dreptunghiului:");
        double height = console.nextInt();
        System.out.println("Lungimea dreptunghiului:");
        double width = console.nextInt();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Aria dreptunghiului este " + rectangle.computeArea()) ;
    }
}