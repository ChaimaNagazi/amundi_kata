/**
 * 
 */
package org.amundi;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author cnagazi class test with junit 4
 */
public class ListUtilsTest {

	@Test(expected = IllegalArgumentException.class)
	public void partition_should_throw_IllegalArgumentException_when_sourceList_isNull()
			throws IllegalArgumentException {
		// Given
		List<Integer> sourceList = null;
		int subListLength = 2;
		// When
		ListUtils.partition(sourceList, subListLength);
	}

	@Test(expected = IllegalArgumentException.class)
	public void partition_should_throw_IllegalArgumentException_when_subListLength_isZero()
			throws IllegalArgumentException {
		// Given
		List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
		int subListLength = 0;
		// When
		ListUtils.partition(sourceList, subListLength);
	}

	@Test
	public void partition_should_return_emptyList() throws IllegalArgumentException {
		// Given
		List<Integer> sourceList = Arrays.asList();
		int subListLength = 2;
		List<List<Integer>> expectedSublist = Arrays.asList();

		// When
		List<List<Integer>> actualSublist = ListUtils.partition(sourceList, subListLength);

		// Then
		assertEquals(expectedSublist, actualSublist);
	}

	@Test
	public void partition_should_return_oneSublist() throws IllegalArgumentException {
		// Given
		List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
		int subListLength = sourceList.size();
		List<List<Integer>> expectedSublist = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5));

		// When
		List<List<Integer>> actualSublist = ListUtils.partition(sourceList, subListLength);

		// Then
		assertEquals(expectedSublist, actualSublist);
	}

	@Test
	public void partition_should_return_correctSublist() throws IllegalArgumentException {
		// Given
		List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
		int subListLength = 2;
		List<List<Integer>> expectedSublist = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

		// When
		List<List<Integer>> actualSublist = ListUtils.partition(sourceList, subListLength);

		// Then
		assertEquals(expectedSublist, actualSublist);
	}

}
