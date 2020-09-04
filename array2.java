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

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Source {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        int temp=0;
        int arr[]=new int[20];
        int n;
         n=in.nextInt(); 
         try{
        if(n<1){
           System.out.println("INVALID_INPUT");
        }
             else{
                 for(int i = 0; i < n; i++)
            {
            
            arr[i] = in.nextInt();
            }
        }
             
                  
        if(n%2==0 && (n>1 || n<20)){
            for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        }
        if(n%2!=0 && (n>1 || n<20)){
            for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        }
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         }catch(Exception e){
            System.out.println("INVALID_INPUT");
        }
        
       
       
        //System.out.println("EXPECTED OUTPUT:");
       
    }
}
