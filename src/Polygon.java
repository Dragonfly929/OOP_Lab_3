import java.util.Hashtable;
import java.util.Random;

public class Polygon extends Line {
    protected double x;
    protected double y;
    private int side;
    private int[] nrSides = {3, 4, 6, 7, 8, 9, 10};
    private final String[] type = {"Triangle", "Quadrilateral", "Pentagon", "Hexagon", "Heptagon", "Nonagon", "Decagon"};
    private final Hashtable<Integer, String> polygonType = new Hashtable<>();

    public Polygon() {
        super(0, 0, 4, 4);
        this.side = side;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    private int getSide() { return side; }
    public Hashtable<Integer, String> getPolygonTypes() { return polygonType; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    private void setSide(int side) { this.side = side; }

    public void listPolygonType() {
        for(int i = 0; i < nrSides.length; i++) {
            polygonType.put(nrSides[i], type[i]);
        }
    }
    public String getPolygonType() {
        Random random = new Random();
        int randomInd = random.nextInt(type.length);
        return "Polygon has " + nrSides[randomInd] + " sides so we have " + type[randomInd];
    }
    // regular polygons
    public String getInteriorAngle() {
        double sum;
        Random random = new Random();
        int randomIndex = random.nextInt(nrSides.length);
        System.out.println("Regular Polygon");
        return type[randomIndex] + "'s Interior angle sum: " + 180*(nrSides[randomIndex]-2) + "degrees" +
                "\n Interior angle: " + (180*(nrSides[randomIndex]-2))/nrSides[randomIndex];
    }

    public double getPerimeter() {
        Random random = new Random();
        this.side = random.nextInt(10);
        int randomIndex = random.nextInt(nrSides.length);
        System.out.println(type[randomIndex] + "'s Perimeter with side's length equal to " + side);
        return nrSides[randomIndex] * side;
    }
    public double getArea() {
        Random random = new Random();
        this.side = random.nextInt(10);
        int randomIndex = random.nextInt(nrSides.length);
        double p = nrSides[randomIndex] * side;
        double a = side/(2 * Math.tan(Math.toRadians(180 / nrSides[randomIndex])));
        System.out.println(type[randomIndex] + "'s Area with side equal to " + side +": ");
        return p*a/2;
    }

}
