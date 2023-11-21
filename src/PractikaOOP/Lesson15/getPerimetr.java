package PractikaOOP.Lesson15;

public interface getPerimetr {

    double Perimetr();
    default double getSide(Point point1,Point point2){
        return point1.Distans(point2);
    }
    default double getSemiPerimetr(double a,double b,double c){
        return (a+b+c)/2;
    }

}
