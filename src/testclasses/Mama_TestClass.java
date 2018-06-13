package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Mama_TestClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nMama_TestClass -> @BeforeSuite - This runs before every Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nMama_TestClass -> @AfterSuite - This runs after every Suite");
	}


	@BeforeClass
	public void setUp() {
		System.out.println("\nMama_TestClass -> @BeforeClass - This runs once before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("\nMama_TestClass -> @AfterClass - This runs once after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nMama_TestClass -> @BeforeMethod - This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nMama_TestClass -> @AfterMethod - This runs after every method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("\nMama_TestClass -> @BeforeTest - This runs before every Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("\nMama_TestClass -> @AfterTest - This runs after every Test");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> @Test - TestNG_TestClass2 -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> @Test - TestNG_TestClass2 -> testMethod2");
	}
}
