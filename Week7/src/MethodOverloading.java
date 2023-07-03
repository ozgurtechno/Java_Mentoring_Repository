public class MethodOverloading {

    public double calculate(int a, double b){
        return a*b;
    }

    private double calculate(double a, int b){
        return a*b;
    }

    public int calculate(int a, int b){
        return a*b;
    }
}

/*
Two or more methods can have the same name inside the same class if they accept different arguments.
This feature is known as method overloading.
Method overloading is achieved by either:
    - changing the number of arguments.
    - or changing the data type of arguments.
It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
 */

// OOP - Abstractions....
