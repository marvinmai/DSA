package de.unistuttgart.dsass2022.ex01.p5;

import static de.unistuttgart.dsass2022.ex01.p5.SelectionSortCheckerList.getSortedTestList;
import static org.junit.Assert.*;

import junit.framework.Assert;
import org.junit.Test;

import de.unistuttgart.dsass2022.ex01.p5.ISimpleList;
import de.unistuttgart.dsass2022.ex01.p5.Sorter;

import java.util.List;

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

    }
}
