package OOP;

public class OOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject geometricObject1 = new GeometricObject();
		//showinfo method
		System.out.println(geometricObject1.showinfo());
		//color default 
		System.out.println("geometricObject1 Color: "+ geometricObject1.color);
		//filled private
		System.out.println("geometricObject1 Filled: "+ geometricObject1.isFilled());
		//filled private
		//System.out.println("geometricObject1 Filled: "+ geometricObject1.filled);
		//date private
		System.out.println("geometricObject1 Date: "+ geometricObject1.getDateCreated());
		//time public 
		System.out.println("geometricObject1 Time: "+ geometricObject1.time);
		//count protected static
		System.out.println("geometricObject Count: "+ geometricObject1.getCount());
		//count protected static
		System.out.println("geometricObject Count: "+ geometricObject1.count);
		//geometricObject1.count=10;
		//count protected static
		System.out.println("geometricObject Count: "+ geometricObject1.count);
		
		System.out.println("---------------------------------------------------------- \n");
		//建構子設定
		GeometricObject geometricObject2 = new GeometricObject("Green",true);
		System.out.println(geometricObject2.showinfo());
		//static 
		System.out.println("geometricObject2 Count: "+ geometricObject2.count);
		System.out.println("---------------------------------------------------------- \n");
		//繼承
		Circle circle =new Circle(5.2);
		System.out.println(circle.showinfo());
		System.out.println("circle Color: "+ circle.color);
		System.out.println("circle Filled: "+ circle.isFilled());
		System.out.println("circle Date: "+ circle.getDateCreated());
		System.out.println("circle Time: "+ circle.time);
		System.out.println("circle Count: "+ circle.getCount());
	
	}

}
