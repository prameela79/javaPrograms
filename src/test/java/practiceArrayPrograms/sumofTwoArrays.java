package practiceArrayPrograms;

public class sumofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
        int[] b={4,5,6};
        int length =Math.max(a.length, b.length);
        int[] res=new int[length];
        for(int i =0;i<res.length-1;i++) {
        	if(i<a.length) {
        		res[i]+=a[i];
        	}
        	if(i<b.length) {
        		res[i]+=b[i];
        	}
        }
        System.out.println(res);

	}

}
