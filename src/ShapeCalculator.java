public class ShapeCalculator implements Calc2D,Calc3D{

    @Override
    public double circleArea(Circle circle) {
        double area= Math.pow(circle.getSideOrRadius(),2)*Math.PI;
        return area;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double area=rectangle.getSideOrRadius()*rectangle.getSide2();
        return area;
    }

    @Override
    public double ballVolume(Ball ball) {
        double volume=4*Math.PI*Math.pow(ball.getSideOrRadius(),3)/3;
        return volume;
    }

    @Override
    public double cubeVelume(Cube cube) {
        double volume=Math.pow(cube.getSideOrRadius(),3);
        return volume;
    }


}
