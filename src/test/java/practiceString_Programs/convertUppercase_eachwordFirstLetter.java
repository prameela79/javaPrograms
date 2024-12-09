package practiceString_Programs;

public class convertUppercase_eachwordFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to tp office";
		String[] arr = s.split(" ");
		for(int i =0;i<arr.length;i++) {
			String s1 = arr[i];
			System.out.println(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}
	}

}
