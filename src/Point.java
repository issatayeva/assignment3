public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow(getY()- point.getY(),2));
    }
}
