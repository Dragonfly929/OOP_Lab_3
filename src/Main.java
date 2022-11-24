public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point P = new Point(3, 6);
        System.out.println("\nP("+ P.getX()+", " + P.getY()+")");
        System.out.println(P.move());
        System.out.println(P.isErased());
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(3, 4);
        if (firstPoint.getX() == secondPoint.getX() && firstPoint.getY() != secondPoint.getY()) {
            System.out.println("\nThe Line the Points form is Vertical");
        } else if (firstPoint.getX() != secondPoint.getX() && firstPoint.getY() == secondPoint.getY()) {
            System.out.println("\nThe Line the Points form is Horizontal");
        } else if (firstPoint.getX() != secondPoint.getX() || firstPoint.getY() != secondPoint.getY()) {
            System.out.println("\nThe Line the Points form is Oblique");
        } else {
            System.out.println("\nThe Points coincide");
        }

        Line l = new Line(0,0,4,4);
        System.out.println(l.printLength());
        System.out.println(l.printAngle());
        System.out.println(l.lineType());
        System.out.println(l.chooseLineType());
        System.out.println(l.chooseLineWeight());

        TriangleSides s = new TriangleSides(3, 4,4);
        System.out.println("The segments given form: " + s.isTriangle());
        if(s.getA() == 0 || s.getB() == 0 || s.getC() == 0) {
            System.out.println("Triangle cannot be formed");
        } else {
            System.out.println("Triangle is " + s.triangleAngle() + " and " + s.typeTriangle());
        }
        System.out.println(s.getArea());

        TriangleCoordinates t = new TriangleCoordinates(0, 0,0,0, 0,3);
        System.out.println(t.getPerimeter());
        System.out.println(t.isValid());

        Rectangle r = new Rectangle(12,6);
        r.draw();
        r.getPerimeter();
        System.out.println("Rectangle's Area of width = "+ r.getWidth() + " and height = " + r.getWidth()+ ": " + r.getArea());

        Circle c = new Circle( 4);
        System.out.println(c.getDiameter());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        c.draw();

        Ellipse e = new Ellipse(4,4);
        System.out.println(e.getPerimeter());
        System.out.println(e.getArea());
        e.getDiameter();
        System.out.println();

        Polygon polygon = new Polygon();
        System.out.println(polygon.getArea());

        Sphere sphere1 = new Sphere(4);
        Sphere sphere2 = new Sphere(9);
        Sphere sphere3 = new Sphere(13);

        sphere1.setSphereDiameter(7);
        System.out.println(sphere1.getSphereVolume());
        System.out.println(sphere1.getSphereArea());

    }

}