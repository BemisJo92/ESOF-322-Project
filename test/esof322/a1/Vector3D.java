//
package pa1;

public class Vector3D
{
	double x, y, z;
	
	public Vector3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D scale(double f)
	{		
		return new Vector3D(x*f, y*f, z*f);
	}
	
	public double magnitude()
	{
		return Math.sqrt((x*x + y*y + z*z));		
	}	
}
