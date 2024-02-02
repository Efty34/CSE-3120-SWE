public class FactoryPattern {
    public static void main(String[] args) {

        ShapeFactory x = ShapeFactory.getInstance();
        ShapeFactory y = ShapeFactory.getInstance();
        ShapeFactory z = ShapeFactory.getInstance();

        /* To Check if the Objects have same HashValue or not */
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        Shape rectangle = shapeFactory.getShape("Cricle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
    
}
