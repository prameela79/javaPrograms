package practiceArrayPrograms;

import java.util.Arrays;

public class left_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] a = {2,4,5,1,7,9}; int rotation = 3;
		 * 
		 * for(int i=0; i<rotation;i++) {
		 * 
		 * int swap = a[0]; //swap the second place element to first place for(int j=0;
		 * j<a.length-1;j++) { a[j] = a[j+1]; } //swap the first element to last
		 * a[a.length-1] = swap; } System.out.println(Arrays.toString(a));
		 */
	int a[]= {1,2,3,4};
	int temp=a[0];
	for(int i=0;i<a.length-1;i++) {
		a[i]=a[i+1];
		
	}
	a[a.length-1]=temp;
		for(int i:a) {
			System.out.print(i+" ");
		
	}
	}
}
