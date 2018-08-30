/* Write a method to find the rectangular intersection of two given rectangles.

As with the example above, rectangles are always "straight" and never "diagonal." More rigorously: each side is parallel with either the x-axis or the y-axis.

They are defined as objects of Rectangle class:

public class Rectangle {

    // coordinates of bottom left corner
    private int leftX;
    private int bottomY;

    // dimensions
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int leftX, int bottomY, int width, int height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

Your output rectangle should be a Rectangle object as well.
*/

/* Things to watch out for:
	No intersection
	One rectangle is entirely submerged in the other
	No intersection, but share an edge. 
*/

private static class IntersectingRect {

    private int startPoint;
    private int length;

    public IntersectingRect(int startPoint, int length) {
        this.startPoint = startPoint;
        this.length = length;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getLength() {
        return length;
    }
}

private static IntersectingRect findIntersectingRect(int point1, int length1, int point2, int length2) {

    // find the highest start point and lowest end point.
    // the highest ("rightmost" or "upmost") start point is
    // the start point of the overlap.
    // the lowest end point is the end point of the overlap.
    int highestStartPoint = Math.max(point1, point2);
    int lowestEndPoint = Math.min(point1 + length1, point2 + length2);

    // return empty overlap if there is no overlap
    if (highestStartPoint >= lowestEndPoint) {
        return new IntersectingRect(0, 0);
    }

    // compute the overlap length
    int overlapLength = lowestEndPoint - highestStartPoint;

    return new IntersectingRect(highestStartPoint, overlapLength);
}

public static Rectangle findRectangularOverlap(Rectangle rect1, Rectangle rect2) {

    // get the x and y overlap points and lengths
    IntersectingRect xOverlap = findIntersectingRect(rect1.getLeftX(), rect1.getWidth(),
                                             rect2.getLeftX(), rect2.getWidth());
    IntersectingRect yOverlap = findIntersectingRect(rect1.getBottomY(), rect1.getHeight(),
                                             rect2.getBottomY(), rect2.getHeight());

    // return "zero" rectangle if there is no overlap
    if (xOverlap.getLength() == 0 || yOverlap.getLength() == 0) {
        return new Rectangle();
    }

    return new Rectangle(
        xOverlap.getStartPoint(),
        yOverlap.getStartPoint(),
        xOverlap.getLength(),
        yOverlap.getLength()
    );
}	