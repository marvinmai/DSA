// SOLUTION
package de.unistuttgart.dsass2022.ex01.p5;

public class InsertionSortCheckerList<T extends Comparable<T>> extends AbstractSortCheckerList<T> {

    public static SimpleList<Integer> getSortedTestList() {
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

    public static SimpleList<Integer> getTestList() {
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

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void append(T element) {

    }

    @Override
    public T getElement(int index) {
        return null;
    }

    @Override
    public void swapElements(int i, int j) {

    }
}
