package practiceString_Programs;

public class swapTwoStrings_withThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	s1="hello";
    	String	s2="world";
    	String s3 =s1+s2;
    	s2=s3.substring(0,s1.length());
    	s1=s3.substring(s2.length());
    	System.out.println(s1);
    	System.out.println(s2);

	}

}
