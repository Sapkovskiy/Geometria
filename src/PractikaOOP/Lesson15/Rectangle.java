package PractikaOOP.Lesson15;

public class Rectangle extends Figure implements getPerimetr,getDiagonal{

    private final Point LeftDownPoint;
    private final Point RightUpperPoint;

    public Rectangle(Point LeftDownPoint, Point RightUpperPoint) {
        this.LeftDownPoint = LeftDownPoint;
        this.RightUpperPoint = RightUpperPoint;
    }
    @Override
    public String toString(){
        return "Треугольник с углами:\nЛевый нижний("+LeftDownPoint
                +")\nПравый верхний("+RightUpperPoint+")";
    }

    @Override
    public double getArea() {
        return ((RightUpperPoint.getX()-LeftDownPoint.getX())
                *(RightUpperPoint.getY()-LeftDownPoint.getY()));
    }

    @Override
    public double Perimetr() {
        return ((RightUpperPoint.getX()-LeftDownPoint.getX())
                +(RightUpperPoint.getY()-LeftDownPoint.getY()))*2;
    }

    public Point getLeftDownPoint() {
        return LeftDownPoint;
    }

    public Point getRightUpperPoint() {
        return RightUpperPoint;
    }

    @Override
    public double Diagonal() {
        return LeftDownPoint.Distans(RightUpperPoint);
    }

}
