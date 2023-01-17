package abstraction.interfaces;

public class Rectangle implements Shape {

    private int width;
    private int heigth;

    private String color;


    public Rectangle(int width, int heigth, String color) {
        this.width = width;
        this.heigth = heigth;
        this.color = color;
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
