public class Rectangle extends Square {
    private int length;

    public Rectangle(int length, int width) {
        super(width);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int width) {
        this.length = length;
    }


    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        // Calculate the 'perimeter' using the formula
        double perimeter = 2 * (length + width);

        System.out.println("The perimeter of the given rectangle of width= "
                + length + " and height= " + width + ": "
                + perimeter);
        return perimeter;
    }

    public void draw() {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == width || j == 1 || j == length)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void display() {
        System.out.println("Width: " + this.length);
        System.out.println("Height: " + this.width);
        System.out.println("Area: " +  getArea());
        getPerimeter();
    }
}