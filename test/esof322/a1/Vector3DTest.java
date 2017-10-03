package pa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector3DTest {

	//Global Variables
	double x = 2.0;
	double y = 3.0;
	double z = 4.0;
	double scalor = 2.0;

	//Compares two doubles to check equality
	public void testEquals(double expected, double testing)
	{
		assertEquals(expected, testing, Double.NaN);
	}
	
	//Compares two Vector3D instances to each other's vars
	public void testEquals(Vector3D v1, Vector3D v2)
	{
		assertEquals(v1.x, v2.x, Double.NaN);
		assertEquals(v1.y, v2.y, Double.NaN);
		assertEquals(v1.z, v2.z, Double.NaN);	
	}
	
	//Compares two strings from two instances of Vector3D
	public void testEquals(String s1, String s2)
	{
		assertEquals(s1, s2);		
	}

	//tests the instance's multiples from Scale() method with expected
	//math for multiplying
	@Test
	public void testScale()
	{
		double scalorX, scalorY, scalorZ;
		
		Vector3D instance = new Vector3D(x, y, z);
		
		scalorX = x * scalor;
		scalorY = y * scalor;
		scalorZ = z * scalor;

		Vector3D v2 = instance.scale(scalor);
		
		//compare instance's vars with expected results
		testEquals(scalorX, v2.x);
		testEquals(scalorY, v2.y);
		testEquals(scalorZ, v2.z);
	}
	
	@Test
	public void testMagnitude()
	{
		Vector3D instance = new Vector3D(x, y, z);
		
		double magnitude;
		magnitude = Math.sqrt((x*x + y*y + z*z));
		
		testEquals(magnitude, instance.magnitude());
	}

	@Test
	public void testAdd()
	{
		Vector3D v1 = new Vector3D(x, y, z);
		Vector3D v2 = new Vector3D(x, y, z);
		
		Vector3D vectorResult = v1.add(v2);
		
		testEquals((x+x), vectorResult.x);
		testEquals((y+y), vectorResult.y);
		testEquals((z+z), vectorResult.z);
		
	}

	@Test
	public void testSubtract() 
	{
		Vector3D v1 = new Vector3D(x, y, z);
		Vector3D v2 = new Vector3D(x, y, z);
		
		Vector3D vectorResult = v1.subtract(v2);
		
		testEquals((x-x), vectorResult.x);
		testEquals((y-y), vectorResult.y);
		testEquals((z-z), vectorResult.z);
	}
	
	@Test
	public void testNegate() 
	{
		double expected = ((-1)*(x + y + z));
		
		Vector3D vectorResult = new Vector3D(x, y, z);
		Vector3D vectorResult2 = vectorResult.negate();
		
		double result = vectorResult2.x + vectorResult2.y + vectorResult2.z;
		
		testEquals(expected, result);
	}

	@Test
	public void testDot()
	{
		Vector3D v1 = new Vector3D(x, y, z);
		Vector3D v2 = new Vector3D(x, y, z);
		
		double result = v1.dot(v2);
		double expected = x*x + y*y + z*z;
		
		testEquals(expected, result);
	}
	
	@Test
	public void testToString()
	{
		Vector3D v1 = new Vector3D(x, y, z); 
		Vector3D v2 = new Vector3D(x, y, z);
		
		String s1, s2;
		
		s1 = v1.toString();
		s2 = v2.toString();
		
		testEquals(s1, s2);		
	}
}
