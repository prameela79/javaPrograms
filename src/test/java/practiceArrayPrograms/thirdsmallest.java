package practiceArrayPrograms;

public class thirdsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max>a[i]) {
				tmax=smax;
				smax=max;		   
				max=a[i];
			}
			else if (smax>a[i]&&a[i]!=max) {
				tmax=smax;
				smax=a[i];
			}
			else if(tmax>a[i]&&a[i]!=max) {
				tmax=a[i];
			}
		}
		System.out.println(tmax);

	}

}
