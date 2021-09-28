import java.util.*;
public class Pascle_Triangle{
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list =  new ArrayList<List<Integer> >();
		if (numRows == 0) return list;
		List<Integer> curr = new ArrayList<Integer>();
		curr.add(1);
		list.add(curr);
		for (int i=1;i<numRows ;i++ ) {
			List<Integer> prev = list.get(i-1);
			curr = new ArrayList<Integer>();
			curr.add(1);
			for (int j=1;j<i;j++){
				curr.add(prev.get(j-1)+prev.get(j));
			}
			curr.add(1);
			list.add(curr);
		}
		return list;
    }
	public static void main(String[] args) {
		System.out.println(new Pascle_Triangle().generate(5));
	}
}