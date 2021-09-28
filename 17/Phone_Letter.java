import java.util.*;
public class Phone_Letter{
	public static List<String> letterCombinations(String digits) {
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        for (int i=0; i<digits.length();i++ ) {
        	
        }
        List<String> list = new ArrayList<String>();
        return list;
    }
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}
}