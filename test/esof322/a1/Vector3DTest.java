package pa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector3DTest {

	Vector3D v = new Vector3D(1, 2, 3);
	
	@Test
	public void testNegate() 
	{
		Vector3D v = new Vector3D(1, 2, 3);
		v.negate();
		double result = v.x + v.y + v.z;
		assertEquals(-6, result, Double.NaN);
	}
	
	@Test
	public void testDot()
	{
		Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
		Vector3D v2 = new Vector3D(2.0, 3.0, 4.0);
		double result = v1.dot(v2);
		assertEquals(20.0, result, Double.NaN);
	}

}
