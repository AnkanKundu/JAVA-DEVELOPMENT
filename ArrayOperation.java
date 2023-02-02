 public class ArrayOperation {
	 public int[] addAlternateElements(int[] arr1,int[] arr2) {
		 int j=0;
		 for (int i=0; i<arr1.length; i+=2) {
			 arr2[j++] = arr1[i];
		 }
		 return arr2;
	 }
 }