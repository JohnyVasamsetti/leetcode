// 1399. Count Largest Group

import java.util.*;
public class Large_Grp{
	public int Sum(int n){
		int s = 0;
		while(n != 0){
			s += n%10;
			n /= 10;
		}
		return s;
	}
	public int countLargestGroup(int n) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int max = Integer.MIN_VALUE, count = 0;
        for (int i = 1;i <= n; i++ ) {
        	int s = Sum(i);
        	if (map.containsKey(s)){
        		map.put(s,map.get(s)+1);
        	}
        	else{
        		map.put(s,1);
        	}
        	if(map.get(s) > max){
        		max = map.get(s);
        		count = 1;
        	}
        	else if (map.get(s) == max){
        		count++;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		System.out.println(new Large_Grp().countLargestGroup(14));
	}
}