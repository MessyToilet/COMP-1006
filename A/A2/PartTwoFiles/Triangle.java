class Triangle extends Shape {
    private XYCoord a;
    private XYCoord b;
    private XYCoord c;

    public Triangle (XYCoord a, XYCoord b, XYCoord c) {
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area () {
        double dis1 = this.a.distance(this.b);
        double dis2 = this.b.distance(this.c);
        double dis3 = this.a.distance(this.c);
        double num = ((this.a.distance(this.b) + this.b.distance(this.c) + this.c.distance(this.a)) / 2);
        return Math.sqrt(num * (num - dis1) * (num - dis2) * (num - dis3));
    }
    public double perimeter () {
        return (this.a.distance(this.b) + this.a.distance(this.c) + this.c.distance(this.b));
    }
    public void setBC (XYCoord b, XYCoord c) {
        this.b = b;
        this.c = c;
    }
}
