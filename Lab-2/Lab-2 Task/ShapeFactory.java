public class ShapeFactory {

    /* Only Added this 2 lines to make SINGLETONE */
    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    /* Same Code from the PDF */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
