class Point3D extends Point2D
{
	float z=0.0f;
	Point3D(float a,float b,float c)
	{
		super(a,b);
		z=c;
	}
	Point3D()
	{
		super();
		z=0;
	}
	float getz()
	{
		return z;
	}
	void setz(float a)
	{
		
		z=a;
	}
	float[] getxyz()
	{
	float f[]=new float[3];
	float f1[]=new float[2];
	f1=getxy();
	f[0]=f1[0];
	f[1]=f1[1];
	f[2]=z;
	return(f);
	}
	void setxyz(float a,float b,float c)
	{
		setxy(a,b);
		z=c;
	}
	String tostring()
	{
	return(" ");
	}
	}
