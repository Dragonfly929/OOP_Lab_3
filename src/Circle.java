public class Circle extends Point{
    protected double radius;

    public Circle(int i) {
        super(3, 6);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius)  {
        if( this.radius < 0 )
            this.radius =  0.00;
        else
            this.radius = radius;
    }

    public void draw() {
        for (double i = -radius; i <= radius; i++) {
            for (double j = -radius; j <= radius; j++) {
                if (i*i + j*j <= radius*radius) System.out.print("* ");
                else                            System.out.print(". ");
            }
            System.out.println();
        }
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    public double getDiameter() { return 2 * this.radius; }
}
