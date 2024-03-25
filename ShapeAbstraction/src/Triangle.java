public class Triangle extends Shape {

    int base;
    int height;
    int side;

    Triangle(int base, int height, int side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    void area() {
        float area = ((float) (height * base) / 2);
        System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is: " + area);
    }

    @Override
    void perimeter() {
        float perimeter = side + height + base;
        System.out.println("The perimeter of a triangle with a side of " + side + ",base of " + base + " and a height of " + height + " is: " + perimeter);
    }

}
