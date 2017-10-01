package pa1;

public class Vector3D {
	
	double x; 
	double y;
	double z;
	
	public static void main(String[] args)
	{
		
	}
	
	public Vector3D(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void negate()
	{
		x *= -1;
		y *= -1;
		z *= -1;
	}
	
	double dot(Vector3D v)
	{
		return (this.x * v.x) + (this.y * v.y) + (this.z + v.z);
	}
}
