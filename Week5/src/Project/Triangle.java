package Project;

public class Triangle {
    int side1;
    int side2;
    int side3;

    public Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(int sideLength){
        side1 = sideLength;
        side2 = sideLength;
        side3 = sideLength;
    }

    public Triangle(int sideLength1, int sideLength2, int sideLength3){
        side1 = sideLength1;
        side2 = sideLength2;
        side3 = sideLength3;
    }

    public String getTriangleType(){
        if(side1 == side2 && side2 == side3)
            return "equilateral";
        else
        if(side1 == side2 || side2 == side3 || side1 == side3)
            return "isosceles";
        else
            return "scalene";
    }
}
