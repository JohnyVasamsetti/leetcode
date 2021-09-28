// 22. Generate Parentheses
import java.util.*;
public class Gen_Paren{
	public static void generate(List<String> lst , String s ,int open , int closed , int n) {
		if(open == closed && closed == n){
        	lst.add(s);
        	return;
        }
        if (open < n)
        	generate(lst,s+"(",open+1,closed,n);
        if (closed < open)
        	generate(lst,s+")",open,closed+1,n);
        
    }
	public static List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<String>();
        generate(lst,"",0,0,3);
        return lst;
    }
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
}