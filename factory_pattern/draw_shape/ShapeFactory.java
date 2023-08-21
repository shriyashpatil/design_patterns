package factory_pattern.draw_shape;

public class ShapeFactory {

    public static Shape getShape(String shape){

        switch(shape){

            case "cirlce": return new Circle();

            case "rectangle":return new Rectangle();

            case "square": return new Square();

            default: return new Circle();
        }

    }
    
}
