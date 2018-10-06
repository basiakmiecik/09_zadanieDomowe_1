public class Rectangle extends GeometricShape{

    int side2;

    public Rectangle(int sideOrRadius, int side2) {
        super(sideOrRadius);
        this.side2 = side2;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
}
