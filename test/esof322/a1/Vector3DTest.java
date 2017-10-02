package pa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector3DTest {

	@Test
	public void testAdd()
	{
		Vector3D v1 = new Vector3D(1,2,3);
		Vector3D v2 = new Vector3D(1,2,3);
		
		Vector3D vectorResult = v1.add(v2);
		
		assertEquals(2, vectorResult.x, Double.NaN);
		assertEquals(4, vectorResult.y, Double.NaN);
		assertEquals(6, vectorResult.z, Double.NaN);
		
	}

	@Test
	public void testSubtract() 
	{
		Vector3D v1 = new Vector3D(1,2,3);
		Vector3D v2 = new Vector3D(1,2,3);
		
		Vector3D vectorResult = v1.subtract(v2);
		
		assertEquals(0, vectorResult.x, Double.NaN);
		assertEquals(0, vectorResult.y, Double.NaN);
		assertEquals(0, vectorResult.z, Double.NaN);
	}
	
	@Test
	public void testNegate() 
	{
		Vector3D vectorResult = new Vector3D(1, 2, 3);
		vectorResult.negate();
		double result = vectorResult.x + vectorResult.y + vectorResult.z;
		assertEquals("Result", -6, result, Double.NaN);
		assertEquals(-6, result, Double.NaN);
	}

	@Test
	public void testDot()
	{
		Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
		Vector3D v2 = new Vector3D(2.0, 3.0, 4.0);
		double result = v1.dot(v2);
		assertEquals("Result", 20.0, result, Double.NaN);
		assertEquals(20.0, result, Double.NaN);
	}
}
