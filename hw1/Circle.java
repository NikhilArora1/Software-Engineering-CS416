import PointCP.PointCP;

public class  Circle extends EllipticalShape
{
	
	//PointCP[] vert=new PointCP[2];
   private	PointCP[] vert;
	
	
	public Circle()
	{
		
		super();
		vert = new PointCP[4];
		vert[0] = new PointCP();
		vert[1] = new PointCP();
		vert[2] = new PointCP();
		vert[3] = new PointCP();
		
	}
	
	public PointCP[] rotate(double rotation)
	{
		return null;
	}
	
	public void changeScale(int x)
	{
		radius=((radius*x)/100);
	}
	
	public double getArea()
	{
		return (3.14*radius*radius);
	}
	
	public double getPerimeterLength()
	{
		return (6.14*radius);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public PointCP getVertices(int i)
	{
		getBoundingRect();
		return vert[i];
	}
	
	
	
	public PointCP[] getBoundingRect()
	{
		 vert[0].setX(((cp.getX())+ getRadius()));
		 vert[0].setY(((cp.getY())+ getRadius()));
		 vert[1].setX(((cp.getX())- getRadius()));
		vert[1].setY(((cp.getY())+ getRadius()));
		vert[2].setX(((cp.getX())- getRadius()));
		vert[2].setY(((cp.getY())- getRadius()));
		vert[3].setX(((cp.getX())+ getRadius()));
		vert[3].setY(((cp.getY())- getRadius()));
		return vert;
	}
	
	public PointCP[] getvert()
	{
		return vert;
	}
	/*public static void main(String[] args) 
	{
		
    	
		Circle circ = new Circle();

		circ.radius=3; 
	    System.out.println("area"+ circ.getArea()+"perimeter"+circ.getPerimeterLength());
	    for(int i=0;i<2;i++)
		{
		   
		   System.out.println(((circ.getVertices(i)).getX())+"    "+((circ.getVertices(i)).getY()));
			
     	}
	
	}*/
}
