package practiceString_Programs;

public class countconsecutivecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aaabbaaccbac";
		int count = 1;
		String s1 ="";
		for(int i =0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				s1=s1+s.charAt(i)+count;
				count=1;
			}
		}
		s1 = s1+s.charAt(s.length()-1)+count;
		System.out.println(s1);
	}

}
