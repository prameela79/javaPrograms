package practiceString_Programs;

public class first_lastword_character_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my country is india";
        String[] s1 = s.split(" ");
       s1[0]= new StringBuilder(s1[0]).reverse().toString();
      s1[s1.length-1]= new StringBuilder(s1[s1.length - 1]).reverse().toString();
      String result = String.join(" ", s1);
        System.out.println(result);

	}

}
