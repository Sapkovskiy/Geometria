package PractikaOOP.Lesson15;

public final class ShapeUtils {

    private ShapeUtils(){

    }

    public static boolean isTriangle(Figure figure){

        if(figure instanceof Triangle){
            return true;
        }
        return false;
    }

    public static boolean isRectangle(Figure figure){

        if(figure instanceof Rectangle){
            return true;
        }
        return false;
    }
}
