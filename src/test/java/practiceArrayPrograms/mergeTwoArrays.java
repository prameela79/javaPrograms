package practiceArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] c= new int[a.length+b.length];
		for(int i=0;i<=c.length-1;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[i-b.length];
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
