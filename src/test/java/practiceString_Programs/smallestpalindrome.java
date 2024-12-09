 package practiceString_Programs;

public class smallestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ava madam nananan";
        String s1[]=s.split(" ");
        String minPal=s1[0];
        for(String s2:s1){
            String rev=new StringBuilder(s2).reverse().toString();
            if(s2.equals(rev)&& rev.length()<minPal.length()){
                minPal=rev;
            }
        }
        System.out.println(minPal);

	}

}
