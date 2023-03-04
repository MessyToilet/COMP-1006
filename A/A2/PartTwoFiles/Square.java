class Square extends Quadrilateral {
    private double length;
    private XYCoord a;
    public Square (XYCoord a, double length) {
        super(a);
        this.length = length;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public double area () {
        return (this.length * this.length);
    }
    public double perimeter () {
        return (this.length * 4);
    }
}
