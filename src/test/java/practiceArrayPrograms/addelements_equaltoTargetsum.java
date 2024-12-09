package practiceArrayPrograms;

public class addelements_equaltoTargetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 14,10, 5, 7, 8, 6, 9,1 };
		int targetSum = 15;
		for (int i = 0; i < a.length ; i++) {
			for (int j = i + 1; j < a.length ; j++) {
				int sum = a[i] + a[j];

				if (sum == targetSum) {
					System.out.println(a[i] + ":" + a[j]);
				}
			}

		}
	

	}

}
