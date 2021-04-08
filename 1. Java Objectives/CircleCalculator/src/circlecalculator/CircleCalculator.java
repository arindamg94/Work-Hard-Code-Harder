package circlecalculator;

public class CircleCalculator {

    public static void main(String[] args) {
        
           //Set a variable with value of radius
    double r = 23.5;
    
    //Access class Circle to calculate Area
    String AreaFound = String.format("%.2f", Circle.area(r)); 
    System.out.println("Area of circle with " + r + " is " + AreaFound);
    
    //Access class Circle to calculate circumference
    String CircumferenceFound = String.format("%.2f", Circle.circumference(r));
    System.out.println("Circumference of circle with " + r + " is " + CircumferenceFound);
    
    //Access class Circle to calculate diameter
    String DiameterFound = String.format("%.2f", Circle.diameter(r));
    System.out.println("Circumference of circle with " + r + " is " + DiameterFound);
  
    }
}
