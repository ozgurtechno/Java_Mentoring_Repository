package abstraction.interfaces;

public class Rectangle implements Shape {

    private int width;
    private int heigth;


    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public int area() {
        return width * heigth;
    }

    @Override
    public int perimeter() {
        return 2 * ( width + heigth );
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}
