package de.unistuttgart.dsass2022.ex01.p5;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SorterTest {

    private final Map<SimpleList<Integer>, SimpleList<Integer>> testListCouples;

    public SorterTest() {
        this.testListCouples = TestListData.getTestListCouples();
    }

    @Test
    public void selectionSort() {
        for (Map.Entry<SimpleList<Integer>, SimpleList<Integer>> couple: testListCouples.entrySet()) {
            Sorter.selectionSort(couple.getKey());

            assertEquals(couple.getKey(), couple.getValue());
        }
    }

    @Test
    public void insertionSort() {
        for (Map.Entry<SimpleList<Integer>, SimpleList<Integer>> couple: testListCouples.entrySet()) {
            Sorter.insertionSort(couple.getKey());

            assertEquals(couple.getKey(), couple.getValue());
        }
    }

    @Test
    public void bubbleSort() {
        for (Map.Entry<SimpleList<Integer>, SimpleList<Integer>> couple: testListCouples.entrySet()) {
            Sorter.bubbleSort(couple.getKey());

            assertEquals(couple.getKey(), couple.getValue());
        }
    }
}
