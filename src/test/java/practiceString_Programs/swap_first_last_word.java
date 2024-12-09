package practiceString_Programs;

import java.util.Arrays;

public class swap_first_last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is Good";
		String s1[] = s.split(" ");

		String temp = "";
		temp = s1[s1.length - 1];
		s1[s1.length - 1] = s1[0];
		s1[0] = temp;

		System.out.println(Arrays.toString(s1));
		


	}

}
