import PointCP.PointCP;
abstract public class SimplePolygon extends Polygon
{
	double orientation;
	abstract public PointCP getVertices1(int i);
	
		
	
	
	abstract public PointCP[] rotate( double r);
	
	public double getOrientation()
	{
		return orientation;
	}
}