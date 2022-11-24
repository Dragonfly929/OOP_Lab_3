public class Sphere extends Circle {
    private double area;
    private double volume;

    public Sphere(double radius) {
        super(4);
        this.radius = radius;
        setSphereVolume();
        setSphereArea();
    }
    public void setSphereVolume() {
        volume = Math.PI * (4.0 / 3.0) *
                Math.pow((double) 2*radius / 2.0, 3);
    }

    public double getSphereVolume() {
        return volume;
    }

    public double getSphereArea() {
        return area;
    }

    public void setSphereArea() {
        area = Math.PI * 4.0 *
                Math.pow((double) 2*radius / 2.0, 2);
    }
    public String toString() {
        String info1 = Integer.toString((int) (2*radius));
        String info2 = Double.toString(area);
        String info3 = Double.toString(volume);
        return "Diameter: " +
                info1 + "\t" + "Area: " + info2 + "\t" +
                "Volume: " + info3 + "\t";
    }

    public void setSphereDiameter(int i) {}
}