package patterns;

public class reverseLeftTriange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i<=j)
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
