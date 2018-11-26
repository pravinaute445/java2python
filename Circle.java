public class Circle {

    final Point2D center;
    final double radius;

    public Circle(double x, double y, double radius) {
        center = new Point2D.Double(x, y);
        this.radius = radius;
    }

    public Circle(Point2D.Double center, double radius) {
        this(center.getX(), center.getY(), radius);
    }

    public Point2D getCenter() {
        return new Point2D.Double(getCenterX(), getCenterY());
    }

    public double getCenterX() {
        return center.getX();
    }

    public double getCenterY() {
        return center.getY();
    }

    public double getRadius() {
        return radius;
    }
}

