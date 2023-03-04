public class ShapeExampleApp{

    private static double epsilon = 0.0000001;

    // private helper methods for the program
    private static boolean eq(double x, double y){
        return Math.abs(x-y) < epsilon;
    }

    private static void show(Object o){
        System.out.println(o.toString());
    }

    
    public static void main(String[] args){
        XYCoord a,b,c,d; // used for coordinates

        show("Simple Shape Example Program");
        show("----------------------------");



        a = new XYCoord(0.0,0.0);
        b = new XYCoord(0.0,1.0);
        c = new XYCoord(1.0,1.0);
        d = new XYCoord(1.0,0.0);

        // make a quadrilateral shape
        Quadrilateral q = new Quadrilateral(a,b,c,d);
        show("\nQuadrilateral!");
        show(a + "," + b + "," + c + "," + d);
        show(q.toString());
        show(".expected area = 1.0");
        show(".computed area = " + q.area());
        show(".expected perimeter = 4.0");
        show(".computed perimeter = " + q.perimeter());
        
        // make a square
        Square s = new Square(new XYCoord(1,1), 3);
        show("\nSquare!");
        show(s.toString());
        show(".expected area = 9.0");
        show(".computed area = " + s.area());
        show(".expected perimeter = 12.0");
        show(".computed perimeter = " + s.perimeter());
        show("is Square a Shape     :" + (s instanceof Shape));
        show("is Square a Quadrilateral :" + (s instanceof Quadrilateral));
        show("is Square a Square    :" + (s instanceof Square));
        

        // make a circle
        Circle cc = new Circle(new XYCoord(3,1.5), 7.2);
        show("\nCircle!");
        show(cc.toString());
        show(".expected area = 162.8601631620949");
        show(".computed area = " + cc.area());
        show(".expected perimeter = 45.23893421169302");
        show(".computed perimeter = " + cc.perimeter());
        
        
    
        // make a triangle
        a = new XYCoord(0.0,0.0);
        b = new XYCoord(3.0,4.0);
        c = new XYCoord(6.0,0.0);
        Triangle t = new Triangle(a,b,c);
        show("\nTriangle! (easy case... horizontal base)");
        show(a + "," + b + "," + c);
        show(t.toString());
        show(".expected area = 12.0");
        show(".computed area = " + t.area());
        show(".expected perimeter = 16.0");
        show(".computed perimeter = " + t.perimeter());
     
        
        // make a triangle
        a = new XYCoord(1.01,0.0);
        b = new XYCoord(3.0,4.5);
        c = new XYCoord(18.2,-1.1);
        t = new Triangle(a,b,c);
        show("\nTriangle! (arbitrary orientation)");
        show(a + "," + b + "," + c);
        show(t.toString());
        show(".expected area = 39.772");
        show(".computed area = " + t.area());
        show(".expected perimeter = 38.34430031219233");
        show(".computed perimeter = " + t.perimeter());
     

    }    


}