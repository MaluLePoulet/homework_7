import Shapes.*;

import java.util.Scanner;
import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Input amount of shapes to calculate perimeter for: ");
        Scanner scanner = new Scanner(System.in);
        SqaureAndPerimeterProvider[] shapes = new SqaureAndPerimeterProvider[scanner.nextInt()];

        double sumOfperimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getNextShape();
            System.out.println(shapes[i].getClass().getSimpleName());
            sumOfperimeter += shapes[i].calculatePerimeter();
        }
        System.out.println("Total perimeter of all the shapes is: " + sumOfperimeter);
    }

    private static SqaureAndPerimeterProvider getNextShape() {
        Random random = new Random();
        int randomValue = random.nextInt(3);
        if (randomValue == 0) {
            return new Triangle(5, 5, 10, 6);
        } else if (randomValue == 1) {
            return new Rectangle(10.5, 5.2);
        } else {
            return new Circle(10.3);
        }
    }
}