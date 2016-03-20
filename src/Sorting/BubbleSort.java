package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		// TODO Implement bubble sort
    int switchVar;
    boolean inOrder;
    do {
      inOrder = true;
      for (int element = 0; element < unsortedArray.length - 1; element++) {
        if (unsortedArray[element] > unsortedArray[element + 1]) {
          inOrder = false;
          switchVar = unsortedArray[element + 1];
          unsortedArray[element + 1] = unsortedArray[element];
          unsortedArray[element] = switchVar;
        }
      }
    } while (!inOrder);
    return unsortedArray;
	}
}
