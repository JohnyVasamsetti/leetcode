import java.util.*;
public class Valid_Params{
	public boolean isValid(String s){
		Stack<Character> stk = new Stack<>();
		for (int i=0;i<s.length();i++ ) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c ==  '{'){
				stk.push(c);
			}
			if (c == ')' || c == ']' || c == '}'){
				if (stk.empty())
					return false;
				else if ( c == ')' && stk.peek() == '(') 
					stk.pop();
				else if ( c == ']' && stk.peek() == '[') 
					stk.pop();
				else if ( c == '}' && stk.peek() == '{') 
					stk.pop();
				else 
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new Valid_Params().isValid("()[]{}"));
	}
}