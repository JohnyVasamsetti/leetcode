import java.util.*;
public class Decode_String{
	public static String decodeString(String s) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Character> stack2 = new Stack<Character>();
        String decode = "";
        for (int i=0;i<s.length();i++ ) {
        	char c = s.charAt(i);
        	System.out.println(c);
        	if (c >= '0' && c <= '9'){
        		String num = "";
        		while(c >= '0' && c <= '9'){
        			num += c;
        			c = s.charAt(++i);
        		}
        		stack1.push(Integer.parseInt(num));
        		i--;
        	}
        	else if ( (c >= 'a' && c <= 'z') || c=='[' ){
        		stack2.push(c);
        	}
        	else if (c == ']'){
        		String temp = "";
        		char top2 = stack2.peek();
        		while(top2 != '['){
        			temp = top2 + temp;
        			stack2.pop();
        			top2 = stack2.peek();
        		}
        		stack2.pop();
        		int top1 = stack1.peek();
        		stack1.pop();
        		for (int k=0;k<top1 ; k++) {
        			for (int j=0;j<temp.length() ;j++ ) {
	        			stack2.push(temp.charAt(j));
	        		}
        		}
        	}
        	System.out.println("s1 : " + stack1);
        	System.out.println("s2 : " + stack2);
        }
        while(!stack2.empty()){
        	decode = stack2.peek() + decode;
        	stack2.pop();
        }
        return (decode);
    }
	public static void main(String[] args) {
		String str = "3[a2[bc]]";
		System.out.println(decodeString(str));
	}
}