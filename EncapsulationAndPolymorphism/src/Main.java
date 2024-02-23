public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        System.out.println("The area of the circle is: " + circle1.calculateArea());
        System.out.println("The radius of the circle is: " + ((int) circle1.getRadius()));

        Square square1 = new Square(9);
        System.out.println("The area of the square is: " + square1.calculateArea());
        System.out.println("The side length of the square is: " + ((int)square1.getSideLength()));
    }
}