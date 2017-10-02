package pa1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Vector3DTest {

	@Test
	public void testAdd()
	{
		Vector3D v1 = new Vector3D(1,2,3);
		Vector3D v2 = new Vector3D(1,2,3);
		v1.add(v2);
		Vector3D vectorResult = new Vector3D(2,4,6);
		assertEquals(v1.x, vectorResult.x, Double.NaN);
		assertEquals(v1.y, vectorResult.y, Double.NaN);
		assertEquals(v1.z, vectorResult.z, Double.NaN);
		
	}

	public void testSubtract() 
	{
		Vector3D v1 = new Vector3D(3,4,5);
		Vector3D v2 = new Vector3D(1,2,3);
		v1.subtract(v2);
		Vector3D vectorResult = new Vector3D(2,2,2);
		assertEquals(v1.x, vectorResult.x, Double.NaN);
		assertEquals(v1.y, vectorResult.y, Double.NaN);
		assertEquals(v1.z, vectorResult.z, Double.NaN);
	}
}
