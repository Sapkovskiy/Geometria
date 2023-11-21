package PractikaOOP.Lesson15;

public abstract class Figure {


    public abstract double getArea();

    public boolean isAreaEqual(Figure figure){
        return getArea()== figure.getArea();
    }

}
