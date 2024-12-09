package practiceString_Programs;

public class reverseString_usingRecursion {
	public static void reverse(String s) {
		if(s.length()>=1) {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
	}
	public static void main(String[] args) {
		reverse("prameela");
	}

}
