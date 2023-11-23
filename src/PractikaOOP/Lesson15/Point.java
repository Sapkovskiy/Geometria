package PractikaOOP.Lesson15;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double Distans(Point point){

        double Point1=Math.pow(x- point.x,2);
        double Point2=Math.pow(y- point.y,2);
        return Math.sqrt(Point1+Point2);
    }
    @Override
    public String toString(){
        return "Точка с кординатами:\nX = "+x+"\nY= "+y;
}
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
