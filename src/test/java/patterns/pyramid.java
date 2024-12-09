 package patterns;

public class pyramid {
  public static void main(String[] args) {
	int rownum = 3;
	for(int i =0;i<=rownum;i++) {
		//print spaces
		for(int j=0;j<=rownum-i;j++) {
			System.out.print(" ");
		}
		//print stars
		for(int k =0;k<=i-1;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}

}
