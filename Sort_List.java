/*    Input:
	"java programming language"
Output:
	[java, language, programming]

Input:
	null
Output:
	[]      */
  
  
  import java.util.*;
import java.util.Scanner;
import java.util.Collections;
public class Source {
    //CODE HERE
	public static void main(String[] args) {
	//CODE HERE	
	Scanner sc = new Scanner(System.in);
	if(sc.hasNextLine()){
	    String str = sc.nextLine();
	    List<String> list;
	    list = sort(str);
	    System.out.println(list);
	}
	
	}
	public static List<String>sort(String str){
	    List<String> elist = Collections.emptyList();
	    if(str==null){
	        return elist;
	    }
	    String spstr[] = str.split(" ");
	    List<String> list = Arrays.asList(spstr);
	    Collections.sort(list);
	    return list;
	}
}
