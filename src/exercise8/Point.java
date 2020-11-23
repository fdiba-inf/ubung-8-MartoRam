package exercise8;

public class Point {
    // Define attributes
private double x;
private double y;
    public Point() {
        // Initialize attributes to 0
        x=0;
        y=0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x=x;
        this.y=y;
    }
    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
       x= otherPoint.x;
       y= otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        x=Utils.INPUT.nextDouble();
        y=Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        x=x+xDelta;
        y=y+yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        double xnew=x+xDelta;
        double ynew=y+yDelta;
        return new Point(xnew,ynew);
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        boolean pruf1=Utils.equals(x, otherPoint.x);
        boolean pruf2=Utils.equals(y, otherPoint.y);

        return pruf1&&pruf2;
    }

    public String toString() {
        // Represent attributes as string

        return "(" + x +", "+ y + ")";
    }
}
