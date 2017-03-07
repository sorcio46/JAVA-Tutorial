package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Demo.DemoPRIME;

public class BaseTest {

	@Test
	public void test() {
		assertEquals(1,1);
	}
	
	@Test
	public void testPrime() {
		DemoPRIME d = new DemoPRIME();
		assertTrue(d.isPrime(2));
		assertTrue(d.isPrime(3));
		assertTrue(d.isPrime(5));
		assertTrue(d.isPrime(83));
		assertTrue(d.isPrime(89));
		assertTrue(d.isPrime(97));
		assertFalse(d.isPrime(4));
		assertFalse(d.isPrime(26));
		assertFalse(d.isPrime(87));
		assertFalse(d.isPrime(45));
	}

}
