public class Main {
    public static void main(String[]args) {

        Circle circle1 = new Circle(2);
        circle1.area();
        circle1.perimeter();

        System.out.println("===============================================");

        Rectangle rectangle1 = new Rectangle(2, 3);
        rectangle1.area();
        rectangle1.perimeter();

        System.out.println("===============================================");

        Triangle triangle1 = new Triangle(2, 3, 4);
        triangle1.area();
        triangle1.perimeter();
    }
}
