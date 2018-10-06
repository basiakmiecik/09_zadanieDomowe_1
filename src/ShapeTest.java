public class ShapeTest {
    public static void main(String[] args) {

        ShapeCalculator shapeCalculator= new ShapeCalculator();

        Circle circle=new Circle(10);
        Rectangle rectangle= new Rectangle(5,2);
        Ball ball= new Ball(3);
        Cube cube= new Cube(5);
        Point pStart= new Point(0,0);
        Point pEnd= new Point(10,0);
        Line2D line2D= new Line2D(pStart,pEnd);
        LineCalc lineCalc= new LineCalc();


        System.out.println("Pole okręgu wynosi: "+shapeCalculator.circleArea(circle)+
                "\nPole prostokąta wynosi: " +shapeCalculator.rectangleArea(rectangle)+
                "\nObjętość kuli wynosi: " +shapeCalculator.ballVolume(ball)+
                "\nObjętość sześcianu wynosi: "+shapeCalculator.cubeVelume(cube)+
                "\nDługość odcinka wynosi: " + lineCalc.lineLength(line2D));
    }



}
