import java.util.*;
public class LSBTEC{
	public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> hash = new HashMap<>();
        int count = -1;
        for (int i=0;i<s.length();i++) {
        	if (!hash.containsKey(s.charAt(i))){
        		hash.put(s.charAt(i),i);
        	}
        	else{
        		int temp = i - hash.get(s.charAt(i)) - 1;
        		if (temp > count){
        			count = temp;
        		}
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
	}
}