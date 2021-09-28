import java.util.*;
public class Roman_to_Int{
	public int romanToInt(String s){
		Map <Character,Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		int sum = 0;
		int i=s.length()-1;
		int curr=i;
		while(i!=-1){
			sum += map.get(s.charAt(i));
			i--;
			int inner = 0;
			while(i!=-1 && map.get(s.charAt(curr)) > map.get(s.charAt(i)) ){
				inner += map.get(s.charAt(i));
				i--;
			}
			sum -= inner;
			curr = i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Roman_to_Int n = new Roman_to_Int();
		// String s = "IV";
		String s = "DCXXI";
		// String s = "III";

		System.out.println(n.romanToInt(s));
	}
}