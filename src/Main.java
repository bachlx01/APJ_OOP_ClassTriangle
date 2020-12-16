public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        triangle.setSide1(2.0);
        triangle.setSide2(3.0);
        triangle.setSide3(4.0);


        System.out.println(shape.toString());
        System.out.println(triangle.toString());
    }
}
