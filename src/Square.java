public class Square extends Polygon {
    protected int width;

    public Square(int width) {
        super();
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double[] getLineWeight() { return getLineWeight(); }
    public String[] getLineType() { return getLineType(); }

    public double getArea() {
        return this.width * this.width;
    }

    public double getPerimeter() {
        return 4 * this.width;
    }

    public double getDiagonalLength() {
        return this.width * Math.sqrt(2);
    }
}
