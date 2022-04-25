package de.unistuttgart.dsass2022.ex01.p5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SimpleList<T extends Comparable<T>> implements ISimpleList<T>, Serializable {

	private final List<T> list;

	public SimpleList() {
		list = new ArrayList<T>();
	}

	@Override
	public void append(T element) {
		list.add(element);
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public T getElement(int index) {
		return list.get(index);
	}

	@Override
	public void swapElements(int i, int j) {
		T tmp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, tmp);
	}

	/**
	 * Equality method for testing purposes.
	 * @param other Object to compare this SimpleList to. Type SimpleList is expected.
	 * @return true if content of other list AND sorting is the equal.
	 */
	@Override
	public boolean equals(Object other) {
		boolean isEqual = false;
		if (other instanceof SimpleList<?>) {
			SimpleList<?> otherList = (SimpleList<?>) other;
			isEqual = this.list.equals(otherList.list);
		}
		return isEqual;
	}

}
