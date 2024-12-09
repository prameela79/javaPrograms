package practiceString_Programs;

public class reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is a Programming language";
  		String rev = "";
  		String[] s2 = s.split(" ");
  		for (int i = 0; i <= s2.length - 1; i++) {
  			rev = s2[i] + " " + rev;
  		}

  		System.out.println(rev);

	}

}
