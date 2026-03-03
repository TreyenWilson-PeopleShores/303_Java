public class Triangle extends Shape implements Movable {
    protected double height;
    //protected double width;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;

    /** Constructs a MovablePoint instance at the given x and y */
    public Triangle(int x, int y, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public Triangle(double height) {
        this.height = height;
    }

    public Triangle(double width, double height) {
        this.width = width;
        super.height = height;
    }
    @Override
    public double getArea() {

        double area = (.5*width)*this.height; // initializing value in parent class variable
        return area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle of height " + this.height);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle height = " + height + super.toString() +  "] ";
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
