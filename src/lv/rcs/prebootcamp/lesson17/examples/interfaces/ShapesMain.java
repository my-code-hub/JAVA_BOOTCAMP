package lv.rcs.prebootcamp.lesson17.examples.interfaces;

public class ShapesMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printName();


        Triangle triangle = new Triangle();

        Shape shape = new Triangle();
        Shape shape2 = new Rectangle();

        shape.printName();
        shape2.printName();

        outputShape(rectangle);
        outputShape(triangle);

        outputShape(shape);

        detectClass(shape);
        detectClass(shape2);
    }

    static void outputShape(Shape shape) {
        shape.printName();
    }

    static void detectClass(Shape shape) {
        if (shape instanceof Triangle) {
            System.out.println("This object is Triangle class!");
        } else if (shape instanceof Rectangle) {
            System.out.println("This object is Rectangle class!");
        }
    }

//    static void outputShape(Rectangle rectangle) {
//        System.out.println(rectangle.getArea());
//    }
//
//    static void outputShape(Triangle triangle) {
//        System.out.println(triangle.getArea());
//    }


}
