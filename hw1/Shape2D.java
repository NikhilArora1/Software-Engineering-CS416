import java.util.*;
import PointCP.PointCP;

abstract public class Shape2D 
{ 
    int x,y;
    double rotation;
    public double radius;
    char typecp;
    PointCP cp= new PointCP();
	public void center (int x,int y)
	{
      cp.setX(x);
	  cp.setY(y);		
	}
	
    abstract public PointCP[] rotate( double rotation);
	
	public void translate(int x, int y)
	{
		cp.setX((cp.getX())+x);
		cp.setY((cp.getY())+y);
	}
	
	abstract public void changeScale(int x);
	
	public void getCenter()
	{
		System.out.println("X="+cp.getX()+"  Y="+cp.getY());
	}
	
	abstract public double getArea();
	abstract public double getPerimeterLength();
	abstract public PointCP[] getBoundingRect();
	
	public Shape2D()
	{ 
		super();
		typecp='C';
		rotation=0;
		radius=0;
		x=0;
		y=0;
	}
	public void setrotation(int r)
	{
		rotation=r;
	
	}
	public void settypecp(char c)
	{
		typecp=c;
	}
}