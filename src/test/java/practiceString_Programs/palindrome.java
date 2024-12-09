package practiceString_Programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sun";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		if(s.equals(s2)) {
			System.out.println("Palindrome-->> "+s);
		}
		else {
			System.out.println("not a Palindrome"+s);
		}

	}

}
