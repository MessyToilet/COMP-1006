class Circle extends Shape{
    private double radius;
    public Circle (XYCoord center, double radius) {
        super(center);
        this.radius = radius;
    }
    public double perimeter() {
        return (2 * (Math.PI * radius));
    }
    public double area () {
        return (radius * radius * Math.PI);
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
}
