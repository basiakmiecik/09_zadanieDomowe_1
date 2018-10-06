public class LineCalc {


    public double lineLength(Line2D line) {
        double lenght = Math.sqrt((Math.pow(line.getPointEnd().getX() - line.getPointStart().getX(), 2)
                + Math.pow(line.getPointEnd().getY() - line.getPointStart().getY(), 2)));
        return lenght;
    }


}