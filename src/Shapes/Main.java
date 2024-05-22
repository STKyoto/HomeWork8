package Shapes;


public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
<<<<<<< HEAD
        Shape circle = new Circle();
        System.out.println(shapePrinter.whatIsThis(circle));

        Shape triangle = new Triangle();
        System.out.println(shapePrinter.whatIsThis(triangle));

        Shape diamond = new Diamond();
        System.out.println(shapePrinter.whatIsThis(diamond));

        Shape octagon = new Octagon();
        System.out.println(shapePrinter.whatIsThis(octagon));

        Shape quad = new Quad();
=======
        Circle circle = new Circle();
        System.out.println(shapePrinter.whatIsThis(circle));

        Triangle triangle = new Triangle();
        System.out.println(shapePrinter.whatIsThis(triangle));

        Diamond diamond = new Diamond();
        System.out.println(shapePrinter.whatIsThis(diamond));

        Octagon octagon = new Octagon();
        System.out.println(shapePrinter.whatIsThis(octagon));

        Quad quad = new Quad();
>>>>>>> ce4c789024ad3197c890db4db059313929e2455b
        System.out.println(shapePrinter.whatIsThis(quad));
    }
}