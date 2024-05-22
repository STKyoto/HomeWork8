package Shapes;


public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        Shape circle = new Circle();
        System.out.println(shapePrinter.whatIsThis(circle));

        Shape triangle = new Triangle();
        System.out.println(shapePrinter.whatIsThis(triangle));

        Shape diamond = new Diamond();
        System.out.println(shapePrinter.whatIsThis(diamond));

        Shape octagon = new Octagon();
        System.out.println(shapePrinter.whatIsThis(octagon));

        Shape quad = new Quad();
        System.out.println(shapePrinter.whatIsThis(quad));
    }
}