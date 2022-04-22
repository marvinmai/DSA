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
		int lowerBound = 0;
		int upperBound = list.getSize() - 1;
		// pos: index of the element which will be swapped with the biggest element from the remaining part of the list
		for (int pos = 0; pos < list.getSize() - 1; pos++) {
			T biggestInBoundaries = list.getElement(lowerBound);
			int indexOfBiggest = lowerBound;
			for (int i = lowerBound; i <= upperBound; i++) {
				if (list.getElement(i).compareTo(biggestInBoundaries) > 0) {
					biggestInBoundaries = list.getElement(i);
					indexOfBiggest = i;
				}
			}
			list.swapElements(indexOfBiggest, pos);
			lowerBound++;
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
		for (int pos = 1; pos < list.getSize(); pos++) {
			for (int currentIndex = pos; currentIndex > 0; currentIndex--) {
				T current = list.getElement(currentIndex);
				T swapCandidate = list.getElement(currentIndex - 1);
				if (current.compareTo(swapCandidate) > 0)
					list.swapElements(currentIndex, currentIndex - 1);
			}
		}
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
		boolean sorted = true;
		while (sorted) {
			sorted = false;
			for (int pos = 0; pos < list.getSize() - 1; pos++) {
				T current = list.getElement(pos);
				T next = list.getElement(pos + 1);
				if (current.compareTo(next) < 0) {
					list.swapElements(pos, pos + 1);
					sorted = true;
				}
			}
		}
	}
}
