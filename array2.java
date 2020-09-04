/*  DESCRIPTION
Complete the main method to Accept n numbers and display the numbers in ascending order as output ,if n is even. If n is odd, then display the numbers in descending order

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
The first input n should represent the total number of values entered followed by the actual values to be sorted.
n should be within the range of 1 to 20 . If n is entered as less than 1 or more than 20 , it should show message as INVALID_INPUT.
Example
Sample Input 1:
7
23 45 67 97 65 34 74 

Expected Output:
97 74 67 65 45 34 23 
Sample Input 2:
6
77 44 22 65 28 43

Expected Output2:
22 28 43 44 65 77
Sample Input 3:
0

Expected Output 3:
INVALID_INPUT
Sample Input 4:
30

Expected Output 4:
INVALID_INPUT  */
import java.util.*;

class desComparator implements Comparator<Integer> {
   @Override
   public int compare(Integer o1, Integer o2) {
      return o2.intValue() - o1.intValue();
   }
}

/**
 * Main class
 */
public class Source {
   /**
    * Main method
    * 
    * @param args
    */
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      if (number < 1 || number > 20) {
         System.out.println("INVALID_INPUT");
      } else {

         ArrayList<Integer> arrayList = new ArrayList<Integer>();
         for (int i = 0; i < number; i++) {
            arrayList.add(scanner.nextInt());
         }
         if (number % 2 == 0) {
            // if even, then ascending 1,2,3,4
            Collections.sort(arrayList);
         } else {
            // if odd, then descending 4,3,2,1
            Collections.sort(arrayList, new desComparator());

         }
         for (int i = 0; i < number; i++) {
            System.out.printf("%d ", arrayList.get(i));
         }
      }
   }
}
