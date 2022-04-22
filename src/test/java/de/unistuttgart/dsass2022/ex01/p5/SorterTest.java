package de.unistuttgart.dsass2022.ex01.p5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorterTest {


    @Test
    public void selectionSort() {
        SimpleList<Integer> sortedTestList = SelectionSortCheckerList.getSortedTestList();
        SimpleList<Integer> testList = SelectionSortCheckerList.getTestList();

        Sorter.selectionSort(testList);

        assertEquals(sortedTestList, testList);
    }

    @Test
    public void insertionSort() {
        SimpleList<Integer> sortedTestList = InsertionSortCheckerList.getSortedTestList();
        SimpleList<Integer> testList = InsertionSortCheckerList.getTestList();

        Sorter.insertionSort(testList);

        assertEquals(sortedTestList, testList);
    }

    @Test
    public void bubbleSort() {
        SimpleList<Integer> sortedTestList = BubbleSortCheckerList.getSortedTestList();
        SimpleList<Integer> testList = BubbleSortCheckerList.getTestList();

        Sorter.bubbleSort(testList);

        assertEquals(sortedTestList, testList);
    }
}
