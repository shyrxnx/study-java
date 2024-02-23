class Square implements Shape {
    private final double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}