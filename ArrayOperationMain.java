
public class ArrayOperationMain {
	 public static void main(String[] args) {
		    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    int[] arr2 = new int[arr1.length / 2];

		    ArrayOperation operations = new ArrayOperation();
		    int[] result = operations.addAlternateElements(arr1, arr2);

		    System.out.println("The elements of first array are: ");
		    for (int i = 0; i < arr1.length; i++) {
		      System.out.print(arr1[i] + " ");
		    }
		    System.out.println();

		    System.out.println("The elements of second array are: ");
		    for (int i = 0; i < result.length; i++) {
		      System.out.print(result[i] + " ");
		    }
		  }
}
