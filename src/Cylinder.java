public class Cylinder extends Circle{
    private double z;
    private double height;

    public Cylinder(double radius, double height) {
        super(4);
        this.radius = radius;
        this.height = height;
    }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public double getHeight() { return height; }
    public void setHeight(double height)  {
        if( this.height < 0 )
            this.height =  0.00;
        else
            this.height = height;
    }

    public double getTotalSurfaceArea() {
        System.out.println("Cylinder's area: ");
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double getCylinderVolume() {
        System.out.println("Cylinder's volume: ");
        return Math.PI * radius*radius * height;
    }
}
