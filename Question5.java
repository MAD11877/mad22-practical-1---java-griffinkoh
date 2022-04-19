import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner obj = new Scanner(System.in);
    int numSet = obj.nextInt();
    ArrayList<Integer> numList = new ArrayList<>();
    while (numSet != 0){
      Scanner obj2 = new Scanner(System.in);
      int num = obj2.nextInt();
      numList.add(num);
      numSet--;
    }
    int check = 0;
    for (int count = 0; count < numList.size(); count++){
      int highest = numList.get(count);
      if (highest >= count){
        check = highest;
      }
    }
    System.out.println(check);   
  }
}
