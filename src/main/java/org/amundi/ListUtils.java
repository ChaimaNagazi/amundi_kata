package org.amundi;

import java.util.ArrayList;
import java.util.List;

/**
 * utility class to manage list
 *
 */
public class ListUtils {

	/**
	 * @param sourceList
	 * @param subListLength
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static <T> List<List<T>> partition(List<T> sourceList, int subListLength) throws IllegalArgumentException {
		if (sourceList == null || subListLength <= 0) {
			throw new IllegalArgumentException("Illegal Params!");
		}
		List<List<T>> subLists = new ArrayList<List<T>>();
		for (int i = 0; i < sourceList.size(); i += subListLength) {
			subLists.add(sourceList.subList(i, Math.min(i + subListLength, sourceList.size())));
		}
		return subLists;
	}
}
