/*   DESCRIPTION
roblem Statement: Merge and Sort List
Create a static method named mergeAndSort in the class Source as given below



Method should read two integer List's, containing 5 elements each, as input
Merge the two List's and sort the merged List in ascending order
Fetch the elements at 2nd, 6th and 8th index into a new List and return the List.(index starts from 0)
Method should throw IllegalArgumentException, if the input list does not contain exactly 5 elements or if the input list is null
Note: The input lists should not be modified in the method   */

//IMPORT HERE
import java.util.*;
public class Source {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	if(sc.hasNextInt()){
	    int i;
	    List<Integer>l1 = new ArrayList<Integer>();
	    List<Integer>l2 = new ArrayList<Integer>();
	    List<Integer>new_list = new ArrayList<Integer>();
	    for(i=0;i<5;i++){
	        l1.add(sc.nextInt());
	    }
	    for(i=0;i<5;i++){
	        l2.add(sc.nextInt());
	    }
	    new_list = mergeAndSort(l1,l2);
	    System.out.println(new_list);
	    
	    }

	}

	public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) 
	{
	//CODE HERE	
	List<Integer>merge_list = new ArrayList<Integer>();
	List<Integer>final_list = new ArrayList<Integer>();
	merge_list.addAll(al1);
	merge_list.addAll(al2);
	Collections.sort(merge_list);
	final_list.add(merge_list.get(2));
	final_list.add(merge_list.get(6));
	final_list.add(merge_list.get(8));
	return final_list;
	}
}
