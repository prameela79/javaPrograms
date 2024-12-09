 package practiceArrayPrograms;

public class positionofallduplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 1, 4, 3, 1, 2, 4, 3, 5};

        System.out.println("Duplicate elements and their positions (excluding first occurrences):");
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true; // Mark as duplicate
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("Element: " + a[i] + " at Position: " + i);
            }
        }
        
        

	}

}
