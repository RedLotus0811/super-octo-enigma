// represents a point in 2D space
public class Point {
    private int x;
    private int y;

    public Point() {
        this(0 , 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0 ,0);
    }

    public double distance(int x, int y) {
        return distance(new Point(x , y));
    }

    public double distance(Point point) {

        double xDeltaSqr = Math.pow((this.x - point.getX()), 2);
        double yDeltaSqr = Math.pow((this.y - point.getY()), 2);

        return Math.sqrt(xDeltaSqr + yDeltaSqr);
    }
}
