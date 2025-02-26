/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

public class Octagon extends Shape2D  {

    private double sideLength;
    /**
     * Constructor for Octagon shape object
     * @param centre The centre of the Octagon represented as a Point object
     * @param sideLength The length of Octagon
     */
    public Octagon(Point centre, double sideLength) {

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

        return 2 * (1 + Math.sqrt(2)) * sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength * 8;
    }

    @Override
    // Check if point's distance is <= to circumRadius (circle approximation)
    public boolean containsPoint(Point point) {
        double x = point.getXCord();
        double y = point.getYCord();
        double cx = centre.getXCord();
        double cy = centre.getYCord();
        double R = sideLength * (2 + Math.sqrt(2)) / 2;

        double distanceSquared = (x - cx) * (x - cx) + (y - cy) * (y - cy);
        return distanceSquared <= R * R; // Avoid sqrt for speed
    }

    @Override
    public Point[] getVertices() {

        final int SIDES = 8;
        final int ANGLE = 45;
        double circumRadius = sideLength * (2 + Math.sqrt(2)) / 2;

        Point[] vertexList = new Point[SIDES];

        for (int i = 0; i < SIDES; i++) {

            double theta = Math.toRadians(ANGLE) * i;
            double XCord = centre.getXCord() + circumRadius * Math.cos(theta);
            double YCord = centre.getYCord() + circumRadius * Math.sin(theta);

            vertexList[i] = new Point(XCord, YCord);
        }

        return vertexList;
    }

}
