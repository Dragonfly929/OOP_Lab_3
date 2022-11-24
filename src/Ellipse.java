public class Ellipse extends Circle{
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super(4);
        this.a = a;
        this.b = b;
    }


    public double getA() { return a; }
    public double getB() { return b; }

    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }

    public double getArea() {
        System.out.println("Ellipse's Area for a = " + a + " b = " + b);
        return Math.PI * a * b;
    }
    public double getPerimeter() {
        System.out.println("Ellipse's Perimeter simple approximation: " + 2*Math.PI*Math.sqrt((a*a+b*b)/2));
        System.out.println("Ellipse's Perimeter computed with Ramanujan approximation: ");
        double h = (Math.pow((a-b), 2)/Math.pow((a+b), 2));
        return Math.PI * (a+b) * (1 + ((3*h) / (10+Math.sqrt(4-3*h))));
    }

    public double getDiameter() {
        if (a > b) {
            System.out.println("Major axis diameter: " + 2*a +
                    "\nMinor axis diameter: " + 2*b);
        } else if(a < b) {
            System.out.println("Major axis diameter: " + 2*b +
                    "\nMinor axis diameter: " + 2*a);
        } else {
                System.out.println("Circle with diameter:" + 2*a);
        }
        return 0;
    }
}
