package patterns;

public class basic_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==1||j==1||i==row||j==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
