/**
 * @(#)nikhil.java
 *
 *
 * @author 
 * @version 1.00 2008/10/1
 */

public class nikhil {
        
    /**
     * Creates a new instance of <code>nikhil</code>.
     */
    public nikhil() {
    }
    
    /**
     * @param args the command line arguments
     */
   	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		rect.height=3;
		rect.width=4;
		System.out.println("area"+ rect.getArea()+"perimeter"+rect.getPerimeterLength());
		for(int i=0;i<4;i++)
		{
			System.out.println(((rect.getVertices1(i)).getX())+"    "+((rect.getVertices1(i)).getY()));
			
		}
		
		
		// circle part 
		
		
		Circle circ = new Circle();

		circ.radius=3; 
	    System.out.println("area"+ circ.getArea()+"perimeter"+circ.getPerimeterLength());
	    for(int i=0;i<4;i++)
		{
		   
		   System.out.println(((circ.getVertices(i)).getX())+"    "+((circ.getVertices(i)).getY()));
			
     	}
	
	}
}
