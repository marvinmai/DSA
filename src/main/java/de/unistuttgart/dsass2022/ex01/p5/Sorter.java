package de.unistuttgart.dsass2022.ex01.p5;

import java.util.List;

public class Sorter {

	/**
	 * Performs selection sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		int upperBound = list.getSize() - 1;
		for (int pos = list.getSize() - 1; pos > 0; pos--) {
			T biggestInBoundaries = list.getElement(0);
			int indexOfBiggest = 0;
			for (int i = 1; i <= upperBound; i++) {
				if (list.getElement(i).compareTo(biggestInBoundaries) > 0) {
					biggestInBoundaries = list.getElement(i);
					indexOfBiggest = i;
				}
			}
			list.swapElements(indexOfBiggest, pos);
			upperBound--;
		 }
	}

	/**
	 * Performs insertion sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		
	}

	/**
	 * Performs bubble sort on provided list, works directly on list object, hence
	 * no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		
	}
}
