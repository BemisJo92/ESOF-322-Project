//
package pa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector3DTest {

	//Global Variables
	double x = 2.0;
	double y = 3.0;
	double z = 4.0;
	double scalor = 2.0;	
		
	@Test
	public void test() {		
		//Instance of Vector3D
		Vector3D v1 = new Vector3D(x, y, z);
		
		//Method Calling
		testEquals(x, v1.x);
		testEquals(y, v1.y);
		testEquals(z, v1.z);
		
		testScale(scalor, v1);
		
		testMagnitude(v1);
	}
	
	//Compares two doubles to check equality
	public void testEquals(double expected, double testing)
	{
		assertEquals(expected, testing, Double.NaN);
	}
	
	//Tests the instance's multiples from Scale() method with expected 
	//math for multiplying
	public void testScale(double scalor, Vector3D instance)
	{		
		double scalorX, scalorY, scalorZ;
		
		scalorX = x * scalor;
		scalorY = y * scalor;
		scalorZ = z * scalor;		
		
		Vector3D v2 = instance.scale(scalor);
		//Compare instance's vars with expected results
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
	
}
