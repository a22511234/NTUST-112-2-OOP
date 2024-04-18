package OOP2;

import OOP.GeometricObject;

public class OOPTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject geometricObject1 = new GeometricObject();
		//showinfo method
		System.out.println(geometricObject1.showinfo());
		//color default 
		//System.out.println("geometricObject1 Color: "+ geometricObject1.color);
		//filled private
		System.out.println("geometricObject1 Filled: "+ geometricObject1.isFilled());
		//filled private
		//System.out.println("geometricObject1 Date: "+ geometricObject1.filled);
		//time public 
		System.out.println("geometricObject1 Time: "+ geometricObject1.time);
		//count protected static
		System.out.println("geometricObject Count: "+ geometricObject1.getCount());
		//count protected static
		//System.out.println("geometricObject Count: "+ geometricObject1.count);
		geometricObject1.count=10;
		System.out.println("geometricObject Count: "+ geometricObject1.getCount());
		
	}

}
