package practiceString_Programs;

public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="prameela tikka pilla";
		String[] s1 = s.split(" ");
		String rev="";
		for(int i=0;i<s1.length;i++) {
			String s2=s1[i];
			System.out.println(s2);
			for(int j=s2.length()-1;j>=0;j--) {
				rev=rev+s2.charAt(j);
			}
			rev+=" ";
		}
		System.out.println(rev);

	}

}
