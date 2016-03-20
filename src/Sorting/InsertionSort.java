package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
	int len = unsortedArray.length;
	for (int i = 1; i < len; i++){
		int curr = unsortedArray[i];
		int counter = 0;
		// how many are already sorted, aka where should curr be put
		while (unsortedArray[counter] < curr){
			counter++;
		}
		for (int j = i; j > counter; j--){
			if (j == 0){ 
				break;
			}
			int temp = unsortedArray[j - 1];
			unsortedArray[j - 1] = unsortedArray[j];
			unsortedArray[j] = temp;
		}
	}
    return unsortedArray;
	}
}
