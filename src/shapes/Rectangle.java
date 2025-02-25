/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

public class Rectangle extends Shape2D  {

    private double width;
    private double length;
    /**
     * Constructor for Rectangle shape object
     * @param centre The centre of the Rectangle represented as a Point object
     * @param width The width of rectangle
     * @param length The length of rectangle
     */
    public Rectangle(Point centre, double width, double length) {

        super(centre);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public boolean containsPoint(Point point) {
        double xCord = point.getXCord();
        double yCord = point.getYCord();

        return xCord >= centre.getXCord() - width / 2 &&
                xCord <= centre.getXCord() + width / 2 &&
                yCord >= centre.getYCord() - length / 2 &&
                yCord <= centre.getYCord() + length / 2;
    }

    @Override
    public Point[] getVertices() {

        Point Vertice1 = new Point(centre.getXCord() - width / 2,centre.getYCord() + length / 2);
        Point Vertice2 = new Point(centre.getXCord() + width / 2,centre.getYCord() + length / 2);
        Point Vertice3 = new Point(centre.getXCord() - width / 2,centre.getYCord() - length / 2);
        Point Vertice4 = new Point(centre.getXCord() + width / 2,centre.getYCord() - length / 2);

        return new Point[]{Vertice1, Vertice2, Vertice3, Vertice4};
    }

}
