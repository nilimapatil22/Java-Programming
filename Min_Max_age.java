/* Problem Statement - Find Maximum and Minimum Age
Complete the main method to accept the age of n students and find the maximum and minimum age .

The first input is the number n representing the number of age values you need to enter as integers

Followed by the age values separated by space.

The output should display as shown below in sample input /output.

Following requirements should be taken care in the program.



Input should be taken through Console
Program should print the output as described in the Example Section below
The number n representing the number of students should be allowed in the range of 1 to 20
If n is entered less than 1 or more than 20 , it should print message as INVALID_INPUT.
Example
Sample Input 1:
5
34 56 12 89 43

Sample Ouptut 1:
MIN=12
MAX=89
Sample Input 2:
25 
Expected Output:
INVALID_INPUT 
Sample Input 3:
8
78 44 23 65 45 9 23 39

Expected Output:
MIN=9
MAX=78
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 import java.util.Scanner;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        // Declare the variable
		
		int n=in.nextInt();
		if(n<1 || n>20)
		{
			System.out.println("INVALID_INPUT");
		}
		else
		{
		int ages[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		  ages[i]=in.nextInt();	
		}
		
		
		int min=ages[0];
		for(int i=0;i<n;i++)
		{
			if(ages[i]<min)
				min=ages[i];
		}
		int max=ages[0];
		for(int i=0;i<n;i++)
		{
			if(ages[i]>max)
				max=ages[i];
		}
		
		System.out.println("MIN="+min);
		System.out.println("MAX="+max);
   }
}
}
