DESCRIPTION
Complete the main method of the class Source with appropriate code to accept all the 3 sides of a triangle and display if the triangle is a right angle triangle or not.

A rigt angle triangle is a triangle whose sum of squares of two sides will result in the square of the third side.
Sample Input 1:
5 4 3 
Expected Output:
RIGHT ANGLE 
Sample Input 2:
7 6 5 
Expected Output:
NOT RIGHT ANGLE 
Sample Input 3:
13 12 5
Expected Output:
RIGHT ANGLE
Sample Input 4:
4 6 8
Expected Output:
INVALID_INPUT

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
         if(in.hasNextInt()){
            //declare variable
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int s3 = in.nextInt();
            if(s1<s2 || s1<s3){
                System.out.println("INVALID_INPUT");
            }
            else{
                s1*=s1;// squre
                s2*=s2;
                s3*=s3;
                if(s1==(s2+s3)){
                    System.out.println("RIGHT ANGLE");
                }
                else{
                    System.out.println("NOT RIGHT ANGLE");
                }
            }
         }
   }
}
