package practiceArrayPrograms;

import java.util.Arrays;

public class movezerostoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,4,0,5,2,0,1,0};
		int[] arr = new int [a.length];
		int last = a.length-1;
		for(int i =a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				arr[last--] =a[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
