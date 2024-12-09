package practiceString_Programs;

public class addNuminString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab2c3d";
		int sum = 0;
		for(int i =0;i<s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch>='0'&& ch<='9') {
				sum+=ch-48;
			}
		}
		System.out.println(sum);

	}

}
