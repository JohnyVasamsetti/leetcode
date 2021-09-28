// 67. Add Binary

public class Add_Bin{
	public static String addBinary(String a, String b) {
		StringBuilder s = new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while(i >=0 || j >=0){
            int sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            s.insert(0,sum%2);
            carry = sum/2;
        }
        if (carry > 0)
            s.insert(0,carry);
        return s.toString();
    }
	public static void main(String[] args) {
		System.out.println(addBinary("1","111"));
	}
}