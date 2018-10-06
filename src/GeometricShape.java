public abstract class GeometricShape extends Shape2D{
    int sideOrRadius;

    public GeometricShape(int sideOrRadius) {
        this.sideOrRadius = sideOrRadius;
    }

    public int getSideOrRadius() {
        return sideOrRadius;
    }

    public void setSideOrRadius(int sideOrRadius) {
        this.sideOrRadius = sideOrRadius;
    }
}
