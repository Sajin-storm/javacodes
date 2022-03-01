import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
//import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalciTest {

public static Calci cal ;
	

@org.junit.jupiter.api.BeforeAll
public static void BeforeAll() {
	cal=new Calci();
}

     @BeforeEach                                                       //mandatory if u have to exec
      public void Before() {
	  System.out.println("befpre every method");
      }
	
	@Test
	void testAdd() {
		Assertions.assertEquals(9,cal.add(4,5));
	}

	@Test                                                 // to ignore the test cases 
	void testSub() {
		Assertions.assertEquals(6,cal.sub(10, 4));
	}
	
	
	@RepeatedTest(4)
	void testMultiply() {
	
	Assertions.assertEquals(24,cal.multiply(6, 4) );
	}
	
	@AfterEach
	public void after() {
		System.out.println("after each method");
	}

	@AfterAll
public static void AfterAll() {
		System.out.println("all the testcase green");
	}
	
	
	
}
