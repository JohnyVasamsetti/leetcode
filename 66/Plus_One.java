// 66 Plus One
import java.util.*;
public class Plus_One{
	public  static int[] plusOne(int[] digits) {
		boolean flag = false;
        for (int i=digits.length - 1;i>=0;i--) {
        	if (digits[i] == 9){
        		if (i == 0)
        			flag = true;
        		digits[i] =  0;
        	}
        	else{
        		digits[i] += 1;
        		break;
        	}
        }
        if (flag){
        	int[] n = new int[1+digits.length];
        	n[0] = 1;
        	for (int i=0;i<digits.length;i++) {
        		n[i+1] = digits[i];
        	}
        	return n;
        }
        return digits;
    }
	public static void main(String[] args) {
		int digits[] = new int[]{0,1,0};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
}