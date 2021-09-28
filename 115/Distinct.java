public class Distinct{
	public static int count = 0;
	public void Find(String s , String t , int position){
		// if (position == s.length()-1 && s.equals(t)){
		//   	count++;
		//   	return;
		// }
		// if (s.length() < t.length() || position >= t.length()){
		// 	return;
		// }
		Find(s,t,position+1);
		Find(s.substring(0,position) + s.substring(position + 1),t,position);
		return;
	}
	public int numDistinct(String s, String t) {
		Find(s,t,0);
		return count;
    }
	public static void main(String[] args) {
		System.out.println(new Distinct().numDistinct("abcde","bag"));
	}
}