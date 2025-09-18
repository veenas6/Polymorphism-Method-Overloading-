import java.util.Scanner;

class Shape {
    // Overloaded area method for a Circle (taking radius as a parameter)
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Overloaded area method for a Rectangle (taking length and width as
    // parameters)
    double area(double length, double width) {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Overloaded area method in Circle (using its own radius value)
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overloaded area method in Rectangle (using its own length and width)
    double area() {
        return length * width;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        Rectangle rect = new Rectangle(l, w);

        // Using the overloaded method to calculate the area of Circle
        System.out.println("Circle Area (Overloaded method): " + c.area(r)); // Calls overloaded method

        // Using the overloaded method to calculate the area of Rectangle
        System.out.println("Rectangle Area (Overloaded method): " + rect.area(l, w)); // Calls overloaded method

        sc.close();
    }
}
