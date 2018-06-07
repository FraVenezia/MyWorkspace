package Test;

import static org.junit.Assert.fail;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Main.MainJunit;

public class JunitTestClass {
	private int somma;
	static Logger mioLog=Logger.getLogger("Test Log");
	
	@Before
	public void setInt() {
		somma=10;
		mioLog.log(Level.WARNING, "Before");
	}
	@Test
	public void test() {
		mioLog.log(Level.WARNING, " "+somma);
//		fail("Coglione");
	}

	@Test
	public void testSomma() {
		mioLog.log(Level.WARNING, "Test JUnit Somma 5+5=10");
		Assert.assertEquals(somma, MainJunit.somma(5,5));
		mioLog.log(Level.WARNING, "Fine test Somma");
	}

	@After
	public void before() {
		mioLog.log(Level.WARNING, "After");
	}
}
