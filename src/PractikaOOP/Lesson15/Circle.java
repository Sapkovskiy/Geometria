package PractikaOOP.Lesson15;

import static java.lang.Math.PI;

public class Circle extends Figure implements getPerimetr{
private Point point;
private double Radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.Radius = radius;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(Radius,2);
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius() {
        return Radius;
    }

    @Override
    public double Perimetr() {
        return PI*2*Radius;
    }

}
