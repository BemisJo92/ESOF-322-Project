package pa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector3DTest {

	//Global Variables
	double x = 2.0;
	double y = 3.0;
	double z = 4.0;
	double scalor = 2.0;

	public void test()
	{
		//Instance of Vector3D
		Vector3D v1 = new Vector3D(x,y,z);

		//Method calling
		testEquals(x,v1.x);
		testEquals(y,v1.y);
		testEquals(z,v1.z);
		
		testScale(scalor,v1);
		
		testMagnitude(v1);
	}

	//Compares two doubles to check equality
	public void testEquals(double expected, double testing)
	{
		assertEquals(expected, testing, Double.NaN);
	}

	//tests the instance's multiples from Scale() method with expected
	//math for multiplying
	public void testScale(double scalor, Vector3D instance)
	{
		double scalorX, scalorY, scalorZ;

		scalorX = x * scalor;
		scalorY = y * scalor;
		scalorZ = z * scalor;

		Vector 3D v2 = instance.scale(scalor);
		
		//compare instance's vars with expected results
		testEquals(scalorX, v2.x);
		testEquals(scalorY, v2.y);
		testEquals(scalorZ, v2.z);
	}

	public void testMagnitude(Vector3D instance)
	{
		double magnitude;
		magnitude = Math.sqrt((x*x + y*y + z*z));
		
		assertEquals(magnitude, instance.magnitude(), Double.NaN);
	}

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
