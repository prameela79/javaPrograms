package patterns;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rownum=3;
		for(int i=1;i<=rownum;i++) {
			//spaces
			for(int j=1;j<=2*(rownum-i);j++) {
				System.out.print(" ");
			}
			//increase number
			for(int k = 1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		

	}

}
