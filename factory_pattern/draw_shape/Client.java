package factory_pattern.draw_shape;

public class Client{


    public static void main(String args[]){

        Shape s = ShapeFactory.getShape("circle");

        System.out.println(s.draw());

    }

}