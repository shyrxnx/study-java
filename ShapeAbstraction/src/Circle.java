import java.lang.Math;

public class Circle extends Shape{

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        float area = (float) (Math.PI * (radius * radius));
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }

    @Override
    void perimeter() {
        float perimeter = (float) (2 * Math.PI * radius);
        System.out.println("The perimeter of a circle with a radius of " + radius + " is: " + perimeter);

    }
}
