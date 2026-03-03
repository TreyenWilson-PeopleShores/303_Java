public class Rectangle extends Shape implements Movable {
    protected double width;
    //protected double width;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;

    /** Constructs a MovablePoint instance at the given x and y */
    public Rectangle(int x, int y, double width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public Rectangle(double width) {
        this.width = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        super.height = height;
    }
    @Override
    public double getArea() {

        double area = x*y; // initializing value in parent class variable
        return area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Rectangle of width " + this.width);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Rectangle width = " + width + super.toString() +  "] ";
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
