package circlecalculator;

public class Circle {
    //Static method that calculates and returns circle diameter
    public static double diameter(double r){
        return r*2;
    }
    
    //Static method that calculates and returns circle circumference
    public static double circumference(double r){
        return 2*Math.PI*r;
    }
    
    //Static method that calculates and returns circle area;
    static double area(double r){
        return Math.pow(r,2);
    }      
}
