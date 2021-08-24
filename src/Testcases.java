import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class Testcases {
//	@BeforeAll
//	public static void m1() {
//		System.out.println("Executed BeforeALL and once");
//	}
//	@AfterAll
//	public static void m2() {
//		System.out.println("Execute AfterALL and once");
//	}
//	@AfterEach
//	public  void m3() {
//		System.out.println("Execute AfterEach testcase ");
//	}
//	@BeforeEach
//	public  void m4() {
//		System.out.println("Execute BeforeEach testcase ");
//	}
//	@Test
//	public void testAdd()
//	{
//		System.out.println("test1");
//		int addition=Calculator.add(123, 124);
//		
//		assertEquals(247,addition);
//	}
	@Test
	public void testAddEmployee()
	{
		int result=Calculator.addTrainee(111,"aaa");
	    String oldName=Calculator.updateTrainee(111,"bbb");
		assertEquals("aaa",oldName);
		assertEquals(1,result);
				
	}
	@Test
	public void testUpdateEmployee()
	{
		Calculator.addTrainee(111,"aaa");
	    String oldName=Calculator.updateTrainee(111,"bbb");
		assertEquals("aaa",oldName);
		//assertEquals(1,result);
				
	}
	@Test
	public void testFetchAllEmployee() {
		int size=Calculator.FetchAllTrainee();
		assertEquals(1, size);
	}
	
}