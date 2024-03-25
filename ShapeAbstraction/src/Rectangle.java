public class Rectangle extends Shape {

    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        float area = length * width;
        System.out.println("The area of a rectangle with a length of " + length + " and a width of " + width + " is: " + area);
    }

    @Override
    void perimeter() {
        float perimeter = 2 * (length + width);
        System.out.println("The perimeter of a rectangle with a length of " + length + " and a width of " + width + " is: " + perimeter);
    }

}
