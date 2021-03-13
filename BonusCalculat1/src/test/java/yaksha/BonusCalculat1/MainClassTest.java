package yaksha.BonusCalculat1;

import org.junit.Test;
import static yaksha.BonusCalculat1.TestUtils.*;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class MainClassTest     {
	
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testCalculateBonus() throws Exception {
		// Test will pass
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		TreeMap<Integer, Integer> hm2 = new TreeMap<Integer, Integer>();
		List<String> resulList2 = new ArrayList<String>();
		List<String> resulList1 = new ArrayList<String>();
		hm.put(1010, "20-12-1987");
		hm1.put(1010, 10000);
		hm.put(2020, "01-01-1985");
		hm1.put(2020, 14400);
		hm2.put(1010, 12000);
		hm2.put(2020, 17280);
		resulList2.add("1010=12000");
		resulList2.add("2020=17280");
		Map<Integer, Integer> tm = BonusCalculator.calculateBonus(hm, hm1);
		for (Map.Entry<Integer, Integer> tm2 : tm.entrySet()) {
			resulList1.add(tm2.getKey() + "=" + tm2.getValue());
		}
		yakshaAssert(currentTest(), (resulList1.containsAll(resulList2) ? "true" : "false"), businessTestFile);
	}
   
}
