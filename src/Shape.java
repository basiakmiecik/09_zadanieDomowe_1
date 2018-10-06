public abstract class Shape {
    Point pointStart;
    Point pointEnd;

    public Shape() {
    }

    public Shape(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Point getPointStart() {
        return pointStart;
    }

    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }
}
