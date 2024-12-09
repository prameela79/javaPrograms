package practiceString_Programs;

public class swaptwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	s1="hello";
    	String	s2="world";
    	s1=s1+s2;
    	s2=s1.replaceAll(s2,"");
    	s1=s1.replaceAll(s2, "");
    	System.out.println(s1);
    	System.out.println(s2);

	}

}
