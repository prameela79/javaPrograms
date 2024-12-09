package practiceString_Programs;

public class reverseString_usingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prameela";
        String s1 = "";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);

	}

}
