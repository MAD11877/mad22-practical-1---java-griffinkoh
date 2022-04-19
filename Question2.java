import java.util.Scanner;

public class Question2
{
  public static void main(String[] args) 
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner obj1= new Scanner(System.in);
    System.out.println("Enter your height: ");
    double height = obj1.nextDouble();

    
    Scanner obj2= new Scanner(System.in);
    System.out.println("Enter your height: ");
    double weight = obj2.nextDouble();

    double BMI = weight / Math.pow(height, 2);

    System.out.println("Your BMI is: " + BMI);

    
     
  }
}
