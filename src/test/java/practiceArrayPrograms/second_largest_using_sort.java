package practiceArrayPrograms;

import java.util.Arrays;

public class second_largest_using_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,56,43,3,34};
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println(a[a.length-2]);

	}

}
