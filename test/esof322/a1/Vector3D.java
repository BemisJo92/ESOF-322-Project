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
		double x1 = this.x + v.x;
		double y1 = this.y + v.y;
		double z1 = this.z + v.z; 
		Vector3D vectorResult = new Vector3D(x1, y1, z1);
		return vectorResult; 
	}
	

	public Vector3D subtract(Vector3D v)
	{
		double x1 = this.x - v.x;
		double y1 = this.y - v.y;
		double z1 = this.z - v.z; 
		Vector3D vectorResult = new Vector3D(x1, y1, z1);
		return vectorResult; 
	}
	
	
	public Vector3D negate()
	{
		return scale(-1);
	}
	
	double dot(Vector3D v)
	{
		return (this.x * v.x) + (this.y * v.y) + (this.z * v.z);
	}
}

