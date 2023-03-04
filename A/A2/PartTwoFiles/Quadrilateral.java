class Quadrilateral extends Shape {
    private XYCoord a;
    private XYCoord b;
    private XYCoord c;
    private XYCoord d;

    public Quadrilateral (XYCoord a) {
        super(a);
        this.a = a;
    }

    public Quadrilateral (XYCoord a, XYCoord b, XYCoord c, XYCoord d) {
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double area (){
        double dis1 = this.a.distance(this.b);
        double dis2 = this.b.distance(this.c);
        double dis3 = this.a.distance(this.c);
        double num1 = ((this.a.distance(this.b) + this.b.distance(this.c) + this.c.distance(this.a)) / 2);

        double dis4 = this.a.distance(this.d);
        double dis5 = this.d.distance(this.c);
        double dis6 = this.a.distance(this.c);
        double num2 = ((this.a.distance(this.d) + this.d.distance(this.c) + this.c.distance(this.a)) / 2);

        return Math.sqrt(num1 * (num1 - dis1) * (num1 - dis2) * (num1 - dis3)) + Math.sqrt(num2 * (num2 - dis4) * (num2 - dis5) * (num2 - dis6));
    }
    public double perimeter () {
        return (this.a.distance(this.b) + this.a.distance(this.d) + this.c.distance(this.d) + this.c.distance(this.b));
    }
}
