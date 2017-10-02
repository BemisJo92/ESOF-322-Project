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
	
	public Vector3D add(Vector3D v) 
	{
		this.x += v.x;
		this.y += v.y;
		this.z += v.z; 
		return this; 
	}
	
	public Vector3D subtract(Vector3D v)
	{
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
		return this;
	}
	
}