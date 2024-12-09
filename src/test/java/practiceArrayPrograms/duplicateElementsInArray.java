package practiceArrayPrograms;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a={1,2,3,1,3,4,8};
	        for(int i=0;i<=a.length-1;i++){
	            int count=0;
	            for(int j =0;j<=a.length-1;j++){
	            	if(a[i]==a[j]){
	                    count++;
	                }
	                
	            }
	            if(count>1){
	                System.out.println(a[i]);
	}
}
	}
}
