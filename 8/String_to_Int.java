public class String_to_Int{
	public  static int myAtoi(String s) {
        int num = 0;
        int i=0;
        int sign = 1;
        boolean flag = false;
        while(i < s.length() && s.charAt(i)==' '){
            i++;
        }
        while(i<s.length()){
        	if (s.charAt(i) == '-'){
                if (flag == true) return 0;
        		sign = -1;
                flag = true;
        	}
        	else if (s.charAt(i) == '+'){
                if (flag == true) return 0;
        		sign = 1;
                flag = true;
        	}
            else{
                while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i)<= '9' ){
                    int n = Integer.parseInt(s.charAt(i)+"");
                    if ( sign == 1 && (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && n > 7)) )return Integer.MAX_VALUE;
                    if (sign == -1 && ( ((sign * num) < Integer.MIN_VALUE/10) || ((sign * num) == Integer.MIN_VALUE/10 && n > 8) )) return Integer.MIN_VALUE;
                    num = num * 10 + n;
                    i++;
                }
                break;
            }
            i++;
        }
        return ( sign == 1 ? num : sign * num);
    }
	public static void main(String[] args) {
		System.out.println(myAtoi("-2147483649"));
	}
}