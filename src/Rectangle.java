public class Rectangle {
    //Parameters defining rectangle.
    public int width = 0;
    public int height = 0;
    public Point origin;

    /**
     * Constructor for default values.
     */
    public Rectangle() {
        origin = new Point(0, 0);
    }

    /**
     * Constructor for 0,0 as point of origin and user defined width and height.
     * @param w - width for rectangle.
     * @param h - height for rectangle.
     */
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    /**
     * Constructor for user defined origin, length and height of rectangle.
     * @param p - Point of origin.
     * @param w - Width of rectangle.
     * @param h - Height of rectangle.
     */
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    /**
     * Changes the point of origin of a defined rectangle.
     * @param newOrigin - new origin to which the rectangle needs to be moved.
     */
    public void move(Point newOrigin) {
        origin = newOrigin;
    }

    /* Returns the area of rectangle. */
    public int area() {
        return width*height;
    }
}
