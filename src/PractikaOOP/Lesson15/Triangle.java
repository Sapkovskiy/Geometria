package PractikaOOP.Lesson15;

public class Triangle extends Figure implements getPerimetr,getHeight{

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point, Point point2, Point point3) {
        this.point1 = point;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public double getArea() {
        double a = getSide(point1,point2);
        double b = getSide(point2,point3);
        double c = getSide(point3,point1);
        double semiPerimetr= getSemiPerimetr(a,b,c);
        return Math.sqrt(semiPerimetr*(semiPerimetr-a)*(semiPerimetr-b)*(semiPerimetr-c));
    }

    public Point getPoint(){
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }
    public Point getPoint3(){
        return point3;
    }

    @Override
    public double Perimetr() {
        return (getSide(point1,point2)+getSide(point2,point3)+getSide(point3,point1));
    }

    @Override
    public double getSide(Point point1, Point point2) {
        return getPerimetr.super.getSide(point1, point2);
    }

    @Override
    public double Height() {
        double a= getSide(point1,point2);
        return ((2/a)*getArea());
    }
}
