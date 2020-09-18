package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestMainClass {
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	void testHeapSort() throws Exception {
		Integer expectedResult[] = { 1, 32, 54, 67, 78, 99 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		int[] arr = { 99, 54, 67, 32, 1, 78 };
		int result[] = HeapSort.heapSort(arr);
		List<Integer> resultList = new ArrayList<Integer>(result.length);
		for (int i : result) {
			resultList.add(i);
		}
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}
