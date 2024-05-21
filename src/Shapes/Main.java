package Shapes;


public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        Circle circle = new Circle();
        System.out.println(shapePrinter.whatIsThis(circle));

        Triangle triangle = new Triangle();
        System.out.println(shapePrinter.whatIsThis(triangle));

        Diamond diamond = new Diamond();
        System.out.println(shapePrinter.whatIsThis(diamond));

        Octagon octagon = new Octagon();
        System.out.println(shapePrinter.whatIsThis(octagon));

        Quad quad = new Quad();
        System.out.println(shapePrinter.whatIsThis(quad));
    }
}