public class IP{
	public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
}