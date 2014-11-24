import PointCP.PointCP;

public class Rectangle extends SimplePolygon
{
	double height,width;
	PointCP[] vert1;
	
	public PointCP[] rotate(double r)
	{
		vert1[0].rotatePoint(r);
		vert1[1].rotatePoint(r);
		vert1[2].rotatePoint(r);
		vert1[3].rotatePoint(r);
		return vert1;
	}
	public void changeScale(int x)
	{
		height=((x*height)/100);
		width=((x*width)/100);
	}
	
	public void setHeight(double h)
	{
		height=h;
	}
	
	public void setWidth(double w)
	{
		width=w;
	}
	
	public double getArea()
	{
		return (height*width);
	}
	
	public double getPerimeterLength()
	{
		return (2*(height+width));
	}
	
	public PointCP getVertices1(int i)
	{
		vert1[0].setX((cp.getX()+width));
		vert1[0].setY((cp.getY()+height));
		vert1[1].setX((cp.getX()-width));
		vert1[1].setY((cp.getY()+height));
		vert1[2].setX((cp.getX()-width));
		vert1[2].setY((cp.getY()-height));
		vert1[3].setX((cp.getX()+width));
		vert1[3].setY((cp.getY()-height));
		return vert1[i];
		
	}
	
	public Rectangle()
	{
		super();
		height=0;
		width=0;
		vert1 = new PointCP[4];
		vert1[0] = new PointCP();
		vert1[1] = new PointCP();
		vert1[2] = new PointCP();
		vert1[3] = new PointCP();
	}
	
	public PointCP[] getBoundingRect(int i)
	{
		return vert1;
	}
	
	
/*	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		rect.height=3;
		rect.width=4;
		System.out.println("area"+ rect.getArea()+"perimeter"+rect.getPerimeterLength());
		for(int i=0;i<4;i++)
		{
			System.out.println(((rect.getVertices1(i)).getX())+"    "+((rect.getVertices1(i)).getY()));
			
		}
	}
*/}