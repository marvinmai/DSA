package de.unistuttgart.dsass2022.ex01.p5;

import java.util.HashMap;
import java.util.Map;

public class TestListData {


    /**
     * Provides data with unsorted and sorted data in descending order to test sorting algorithms.
     * @return  Map with test list couples, one is unsorted and the other is sorted in descending order.
     *          key of map: unsorted list, value of map: sorted list
     */
    public static Map<SimpleList<Integer>, SimpleList<Integer>> getTestListCouples() {
        Map<SimpleList<Integer>, SimpleList<Integer>> testListCouples = new HashMap<>();
        testListCouples.put(getTestList1(), getTestList1Sorted());
        testListCouples.put(getTestList2(), getTestList2Sorted());
        testListCouples.put(getTestList3(), getTestList3Sorted());
        testListCouples.put(getTestList4(), getTestList4Sorted());

        return testListCouples;
    }

    private static SimpleList<Integer> getTestList1Sorted() {
        SimpleList<Integer> sortedTestList = new SimpleList<>();
        sortedTestList.append(989898);
        sortedTestList.append(3162);
        sortedTestList.append(99);
        sortedTestList.append(14);
        sortedTestList.append(12);
        sortedTestList.append(6);
        sortedTestList.append(5);
        sortedTestList.append(3);
        sortedTestList.append(1);
        sortedTestList.append(0);

        return sortedTestList;
    }

    private static SimpleList<Integer> getTestList1() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.append(5);
        testList.append(989898);
        testList.append(12);
        testList.append(1);
        testList.append(14);
        testList.append(0);
        testList.append(99);
        testList.append(3);
        testList.append(6);
        testList.append(3162);

        return testList;
    }

    private static SimpleList<Integer> getTestList2() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.append(4);
        testList.append(12);

        return testList;
    }

    private static SimpleList<Integer> getTestList2Sorted() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.append(12);
        testList.append(4);

        return testList;
    }

    private static SimpleList<Integer> getTestList3() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.append(4);

        return testList;
    }

    private static SimpleList<Integer> getTestList3Sorted() {
        SimpleList<Integer> testList = new SimpleList<>();
        testList.append(4);

        return testList;
    }

    private static SimpleList<Integer> getTestList4() {
        SimpleList<Integer> testList = new SimpleList<>();

        return testList;
    }

    private static SimpleList<Integer> getTestList4Sorted() {
        SimpleList<Integer> testList = new SimpleList<>();

        return testList;
    }
}
