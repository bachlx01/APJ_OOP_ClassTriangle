public class Shape {
    Double side1 = 1.0;
    Double side2 = 1.0;

    // Constructors

    public Shape(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Shape() {
    }

    // Get and set side1
    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    // Get and set side2
    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    // Method
    public Double getArea() {
        return this.side1 * this.side2;
    }
    public Double getPerimeter() {
        return this.side1 + this.side2;
    }

    @Override
    public String toString() {
        return "Side 1 = " + this.side1 + "; Side 2 = " + this.side2
                + "; Area = " + this.getArea() + "; Perimeter = " + this.getPerimeter();
    }
}
