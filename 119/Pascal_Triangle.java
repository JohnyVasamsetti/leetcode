import java.util.*;
public class Pascal_Triangle{
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> list =  new ArrayList<List<Integer> >();
		List<Integer> curr = new ArrayList<Integer>();
		curr.add(1);
		list.add(curr);
		for (int i=1;i<=rowIndex ;i++ ) {
			List<Integer> prev = list.get(i-1);
			curr = new ArrayList<Integer>();
			curr.add(1);
			for (int j=1;j<i;j++){
				curr.add(prev.get(j-1)+prev.get(j));
			}
			curr.add(1);
			list.add(curr);
		}
		return list.get(rowIndex);
    }
	public static void main(String[] args) {
		System.out.println(new Pascal_Triangle().getRow(1));
	}
}