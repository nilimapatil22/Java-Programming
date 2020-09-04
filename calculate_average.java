/*  Complete the main method of Source class to accept marks of a student in physics,chemistry and mathematics. Calculate average marks and display the grade based on the following criteria.



averageMarks>=70             DISTINCTION
averageMarks>=60             FIRST
averageMarks>=50             SECOND
averageMarks>=40             THIRD
averageMarks<40              FAIL
Following requirements should be taken care in the program.



Input should be taken through Console separated by space or new line
Input marks as integer values.
Program should print the output as described in the Example Section below
If any of the marks value is lesser than zero or greater than 100 then the output should show as INVALIDMARKS
Example
Sample Input 1:	
45
67
89

Expected Output:
FIRST
Sample Input 2:
24
45
34

Expected Output:
FAIL
Sample Input 3:  
 80
 90
 87

Expected Output :
DISTINCTION
Sample Input 4:	    
-44
 34
78

Expected Output :
INVALIDMARKS
Sample Input : 5
45
46
51

Expected Output :
THIRD
Sample Input: 60
104
90
80

Expected Output:
INVALIDMARKS */

import java.util.Scanner;
import java.io.*;
public class Source {
    public static void main(String[] args) {
	// Start Code
	Scanner sc=new Scanner(System.in);
	int phy=sc.nextInt();
	int chem=sc.nextInt();
	int math=sc.nextInt();
	if(phy<1 || phy>100 || chem<1 || chem >100 || math<1 || math>100){
	    System.out.println("INVALIDMARKS");
	}
	else{
	    int average=(phy+chem+math)/3;
	    if(average>=70){
	        System.out.println("DISTINCTION");
	    }
	    else if(average>=60&& average<70){
	        System.out.println("FIRST");
	    }
	    else if(average>=50 && average<60){
	        System.out.println("SECOND");
	    }
	    else if(average>=40 && average<50) {
	        System.out.println("THIRD");
	    }
	    else if (average<40){
	        System.out.println("FAIL");
	    }
	    
	    
	}
