package practiceArrayPrograms;

import org.testng.annotations.Test;

public class sec_smallestElement {
	@Test
	public void sec_Smallest() {
		int [] a = {1,2,3,2,3,5,6,7};
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		for(int i =0;i<a.length;i++) {
			if(min>a[i]) {
				smin = min;
				min = a[i];	
			}
			else if(smin>a[i]&&a[i]!=min) {
				smin = a[i];
			}
		}
		System.out.println("secondmin:"+smin);
	}

}
