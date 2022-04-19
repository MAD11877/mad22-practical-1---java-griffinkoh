import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner obj = new Scanner(System.in);
    int number = obj.nextInt();
    int power = number * number;
    System.out.println(power);
    
  }
}
