/* DESCRIPTION
Complete the main method of Source class with appropriate code to accept an integer in the range 1 to 999 and display the binary equivalent of that number as output.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
If the number is less than 1 or greater than 999 then the output should show as INVALID_INPUT
Use While loop to solve the above problem.*/

import java.util.*;

class Source {

   public static int toAnyBase(int dec, int base) {
      if (dec == 0) {
         return 0;
      } else {
         return dec % base + 10 * (toAnyBase(dec / base, base));
      }
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int decimalInput = scanner.nextInt();
      if (decimalInput < 1 || decimalInput > 999) {
         System.out.println("INVALID_INPUT");
         return;
      } else {
         // Below is the one line method
         // System.out.println(Integer.toBinaryString(decimalInput));


         // passing base as 2 for binary
         // it works with any base
         System.out.println(toAnyBase(decimalInput, 2));
      }
   }
}
