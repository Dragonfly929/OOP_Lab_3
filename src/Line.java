import java.util.Random;

public class Line extends Point {
    private double x1, y1;
    private final double[] lineWeight = {0.05, 0.09, 0.13, 0.2, 0.5, 1, 2};
    private final String[] lineType = {"DASHDOT", "DASHED", "DOT", "ZIGZAG"};

    public double getX1() { return x1; }
    public void setX1(double x1) { this.x1 = x1; }

    public double getY1() { return y1; }
    public void setY1(double y1) { this.y1 = y1; }

    public double[] getLineWeight() { return lineWeight; }
    public String[] getLineType() { return lineType; }

    public Line(int i, int i1, int i2, int i3) {
        super(3, 6);
        super.x = x;
        super.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public String chooseLineType() {
        Random random = new Random();
        int randomIndex = random.nextInt(lineType.length);
        System.out.println("Line type: ");
        switch (lineType[randomIndex]) {
            case "DASHDOT":
                return lineType[randomIndex] + " _._._._._._._._._._._._._._._._._._._";
            case "DASHED":
                return lineType[randomIndex] + " _____________________________________";
            case "DOT":
                return lineType[randomIndex] + " .....................................";
            default:
                return lineType[randomIndex] + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
        }
    }

    public double chooseLineWeight() {
        Random random = new Random();
        int randomWeight = random.nextInt(lineWeight.length);
        System.out.println("Line's weight:");
        return lineWeight[randomWeight];
    }

    public void drawLine(double x, double y, double x1, double y1) {
        System.out.println("Draw a line from x = " + x + " and y = " + y);
        System.out.println("              to x = " + x1 + " and y = " + y1 + "\n");
    }

    public String printLength() {
        double length = Math.sqrt(Math.pow(x1 - x, 2) +
                Math.pow(y1 - y, 2));
        return "Line's length is " + length;
    }

//    public String printLength(Point firstPoint, Point secondPoint) {
//        double length = Math.sqrt(Math.pow(secondPoint.getX() - firstPoint.getX(), 2) +
//                                  Math.pow(secondPoint.getY() - firstPoint.getY(), 2));
//        return "Line's length is " + length;
//    }

    public String printAngle() {
        double angleInDegrees = Math.atan2 (y1-y, x1-x) * 180.0 / Math.PI;
        return "Angle is " + angleInDegrees + " degrees";
    }

    public String lineType() {
        if (x == x1 && y != y1) {
            return "\nThe Line is Vertical\n";
        } else if (x != x1 && y == y1) {
            return "\nThe Line is Horizontal\n";
        } else if (x != x1 || y != y1) {
            return "\nThe Line is Oblique\n";
        } else {
            return "\nThe Points coincide\n";
        }
    }
}
