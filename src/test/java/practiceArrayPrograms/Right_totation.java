package practiceArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Right_totation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,5,1,7,9};
		int rotation = 2;
		for(int i = 0; i < rotation; i++) {
			int last = a[a.length-1];
			for(int j = a.length-1; j>0;j--) {
				a[j] = a[j-1];
			}
			a[0] = last;
			
		}
		System.out.println(Arrays.toString(a));

	}
	
	@Test
	public void rightShiftWithColl() {
   	 Integer a[]= {1,2,3,4,5};
   	 List<Integer> list=Arrays.asList(a);
   	 //System.out.println(list);
   	 Collections.rotate(list, 1);//-1 left rotation
   	 System.out.println(Arrays.toString(a));
	}

}
