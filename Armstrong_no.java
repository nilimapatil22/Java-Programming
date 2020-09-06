**********************************************************************************************************************************
/* Complete the main method to find whether a given 3-digit number is an Armstrong number or not.

An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
For example, 371 is an Armstrong number since 33 + 73 + 13 = 371. */
**********************************************************************************************************************************

import java.util.Scanner;
public class Source {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	if(sc.hasNextInt()){
	    int n = sc.nextInt();
	    if(n<100 || n>999){
	        System.out.println("INVALID_INPUT");
	    }
	    else{
	        int temp = n;
	        int sum =0,rem;
	        while(temp!=0){
	            rem = temp%10;
	            sum = sum+(rem*rem*rem);
	            temp=temp/10;
	        }
	        if(sum==n){
	            System.out.println("ARMSTRONG");
	        }
	        else{
	            System.out.println("NOT ARMSTRONG");
	        }
	    }
	}
        sc.close();
    }
}
