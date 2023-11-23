package PractikaOOP.Lesson15;

import static java.lang.Math.PI;

public class Circle extends Figure implements getPerimetr{
private Point point;
private double Radius;

    public Circle(Point point, double Radius) {
        this.point = point;
        this.Radius = Radius;
    }
    @Override
    public String toString(){
        return "Круг, центр круга:\n"+point
                +"\nРадиус = "+Radius;
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
