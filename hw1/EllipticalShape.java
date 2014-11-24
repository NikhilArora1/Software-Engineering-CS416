abstract public class EllipticalShape extends Shape2D
{
	char semiMajorAxis;
	
	public EllipticalShape()
	{
		super();
		semiMajorAxis='X';
	}
	public void setSemiMajorAxis(char c)
	{
		semiMajorAxis=c;
	}
}