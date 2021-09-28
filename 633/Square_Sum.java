// 633. Sum of Square Numbers

import java.util.*;
public class Square_Sum{
	public boolean judgeSquareSum(int c) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<=Math.sqrt(c);i++) {
        	map.put(i*i,i);
        	int complement = c - (i*i);
        	if (map.containsKey(complement)){
        		return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(new Square_Sum().judgeSquareSum(4));	
	}
}