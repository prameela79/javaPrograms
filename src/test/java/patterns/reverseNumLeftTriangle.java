package patterns;

public class reverseNumLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int row=5;
          int count=0;
          for(int i=1;i<=row;i++) {
        	  for(int j=1;j<=row;j++) {
        		  if(i<j) {
        			  count++;
        			  System.out.print(count+" ");
        		  }
        	  }
        	  System.out.println();
          }
	}

}
