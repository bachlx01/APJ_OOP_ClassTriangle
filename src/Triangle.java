public class Triangle extends Shape{
    Double side3 = 1.0;

    // Constructors

    public Triangle(Double side1, Double side2, Double side3) {
        super(side1, side2);
        this.side3 = side3;
    }

    public Triangle() {
    }

    // Get and set side 3

    public Double getSide3() {
        return side3;
    }

    public void setSide3(Double side3) {
        this.side3 = side3;
    }

    @Override
    public Double getArea() {
        Double height = Math.pow((super.getSide1()/2)*(super.getSide1()/2) + super.getSide2()*super.getSide2(),0.5);
        Double area = (super.getSide1() * super.side2)/2;
        return area;
    }

    @Override
    public Double getPerimeter() {
        return super.getSide1() + super.getSide2() + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle \nSide 1 = " + this.getSide1() + "; Side 2 = " + this.getSide2() + "; Side 3 = " + this.getSide3()
                + "; Area = " + this.getArea() + "; Perimeter = " + this.getPerimeter();
    }
}
