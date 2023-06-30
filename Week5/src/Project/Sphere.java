package Project;

public class Sphere {
    int radius;
    final double PI = 3.14;

    public Sphere(){
        radius = 1;
    }

    public Sphere(int radius){
        this.radius = radius;
    }

    public double getSurfaceArea(){
        return 4 * PI * radius * radius;
    }

    public double getVolume(){
        return (4.0/3) * PI * radius * radius * radius;
    }
}
