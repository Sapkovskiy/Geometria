package PractikaOOP.Lesson15;

public class FigureRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(1,1),new Point(2,1),new Point(2,3));
        Circle circle=new Circle(new Point(3,3),3);
        Rectangle rectangle =new Rectangle(new Point(5,5),new Point(7,7));
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(rectangle);

    }
}
