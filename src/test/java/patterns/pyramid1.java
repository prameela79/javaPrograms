package patterns;

public class pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int row=3;
           for(int i=0;i<=row;i++) {
        	   for(int j=1;j<=row;j++) {
        		   if(i+j>row) {
        			   System.out.print("* ");
        		   }
        		   else {
        			   System.out.print(" ");
        		   }
        	   }
        	   System.out.println();
           }
	}

}
