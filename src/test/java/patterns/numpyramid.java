package patterns;

public class numpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++) {
			int count=0;
			for(int j=1;j<=row;j++) {
				if(i+j>row) {
					count++;
					System.out.print(count+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			
		System.out.println();
		}
		
	}

}
