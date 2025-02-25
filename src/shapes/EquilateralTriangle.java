/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent an Equilateral Triangle shape - contains 3 sides of equal length and
 * contains 3 vertices
 */

public class EquilateralTriangle extends Shape2D  {

    private double sideLength;

    /**
    * Constructor for Equilateral Triangle  shape object
    * @param centre The centre of the Equilateral Triangle represented as a Point object
    * @param sideLength The length of each side (all same as equilateral)
    */
    public EquilateralTriangle(Point centre, double sideLength) {
        super(centre);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    private void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 3 * sideLength;
    }

    @Override
    public boolean containsPoint(Point point) {
        double dx = point.getXCord() - centre.getXCord();
        double dy = point.getYCord() - centre.getYCord();

        if (dy <= Math.sqrt(3) * (dx + sideLength / 3) &&
            dy <= -(Math.sqrt(3) * (dx - sideLength / 3)) &&
            dy >= - ((Math.sqrt(3) / 6) * sideLength)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Point[] getVertices() {
        double eqRXCord = centre.getXCord();
        double eqTYCord = centre.getYCord();

        Point Vertice1 = new Point(eqRXCord, eqRXCord * ((Math.sqrt(3) / 3)) * sideLength);
        Point Vertice2 = new Point(eqRXcord - SideLength / 2, eqTYCord - ((Math.sqrt(3) / 6) * sideLength);
        Point Vertice3 = new Point(eqRXCord + sideLength / 2, eqTYCord - ((Math.sqrt(3) / 6) * sideLength));
    }






}
