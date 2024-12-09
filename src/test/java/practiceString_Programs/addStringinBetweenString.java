package practiceString_Programs;

public class addStringinBetweenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am learning programs";
		String[] s1=s.split(" ");
		String s2="";
		
	//	StringBuilder result = new StringBuilder();
		for(int i=0;i<=s1.length-1;i++) {
			s2=s2.concat(s1[i]).concat(" ");
			//result.append(s1[i]).append(" ");
			if(i==2) {
				s2=s2.concat("java").concat(" ");
				//result.append("java").append(" ");
			}
		}
		System.out.println(s2);

	}

}
