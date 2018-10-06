public abstract class Shape3D extends Shape{
    int sideOrRadius;

    public Shape3D(int sideOrRadius) {
        this.sideOrRadius = sideOrRadius;
    }

    public int getSideOrRadius() {
        return sideOrRadius;
    }

    public void setSideOrRadius(int sideOrRadius) {
        this.sideOrRadius = sideOrRadius;
    }
}
