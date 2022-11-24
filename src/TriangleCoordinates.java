public class TriangleCoordinates extends Polygon {
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;

    public TriangleCoordinates(double x, double y, double x2, double y2, double x3, double y3) {
        super.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public boolean isValid () {
        double a = getSideAB();
        double b = getSideBC();
        double c = getSideAC();
        return !(a+b<c || b+c<a || a+c<b || a == 0 || b == 0 || c == 0);
    }
    public double getSideAB() {
        return Math.sqrt(Math.pow(((x2)-(x)),2) + Math.pow(((y2)-(y)),2));
    }

    public double getSideBC() {
        return Math.sqrt(Math.pow(((x3)-(x2)),2) + Math.pow(((y3)-(y2)),2));
    }

    public double getSideAC() {
        return Math.sqrt(Math.pow(((x)-(x3)),2) + Math.pow(((y)-(y3)),2));
    }

    public double getPerimeter() {
        System.out.println("Triangle's Perimeter: ");
        if (isValid()){
            double A = getSideAB(), B = getSideBC(), C = getSideAC();
            return (A + B + C);
        } return 1;
    }

    public double getArea() {
        System.out.println("Triangle's Area: ");
        double perimeter = getPerimeter();
        double s = (perimeter * 0.5);
        double A = getSideAB(), B = getSideBC(), C = getSideAC();
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }
}
