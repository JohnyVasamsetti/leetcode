// 3. Longest Substring Without Repeating Characters
import java.util.*;
public class Longest_Substring{
	public int lengthOfLongestSubstring(String s) {
		Map<Character,Integer> map = new HashMap<>();
		int start = 0;
		int count = 0;
		for (int i=0;i<s.length() ; i++) {
			if (map.containsKey(s.charAt(i))){
				if (count < map.size()){
					count = map.size();
				}
				int last = map.get(s.charAt(i));
				for (int j=start;j <= last ; j++ ) {
					map.remove(s.charAt(j));
				}
				start = last + 1;
				map.put(s.charAt(i),i);
			}
			else{
				map.put(s.charAt(i),i);
			}
			
		}
		if (count < map.size()){
			count = map.size();
		}
        return count;
    }
	public static void main(String[] args) {
		// String s = "abcabcbb";
		// String s = "dvdf";
		String s = "bbbbb";
		Longest_Substring n =  new Longest_Substring();
		System.out.println(n.lengthOfLongestSubstring(s));
	}
}