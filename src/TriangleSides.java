public class TriangleSides extends Polygon {
    private double a;
    private double b;
    private double c;

    public TriangleSides(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public double getC() { return c; }
    public void setC(double c) { this.c = c; }

    public String isTriangle() {
        if ((a+b) > c && (a+c) > b && (b+c) > a) {
            return "Triangle";
        } else if (a+b == c || a+c == b || b+c == a) {
            return "Degenerate triangle/ Segment";
        } else {
            return "Not Triangle";
        }
    }

    public double getArea() {
        System.out.println("Triangle's Area: ");
        double p = a+b+c / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    public String typeTriangle() // function to calculate the type of triangle
    {
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }
    public String triangleAngle() {
        double x = a * a;
        double y = b * b;
        double z = c * c;
        if(a>b && a>c) // largest side is 'a'
        {
            if(x == y + z)
                return "Right-angled";
            else if(x < y + z)
                return "Acute-angled";
            else
                return "Obtuse-angled";

        }
        else if(b>a && b>c) // largest side is 'b'
        {
            if(y == x + z)
                return "Right-angled";
            else if(y < x + z)
                return "Acute-angled";
            else
                return "Obtuse-angled";
        }
        else // largest side is 'c'
        {
            if(z == x + y)
                return "Right-angled";
            else if(z < x + y)
                return "Acute-angled";
            else
                return "Obtuse-angled";
        }
    }
}
