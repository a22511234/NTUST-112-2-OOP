package OOP;

import java.util.Date;
import java.util.Timer;

public class GeometricObject {

	String color;
	private boolean filled;
	public String time;
	private Date dateCreated;
	protected static  int count=0;

	public GeometricObject() {
		color = "blue";
		filled = false;
		time = "pulic field";
		dateCreated = new Date();
		count++;
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		time = "pulic field";
		dateCreated = new Date();
		count++;
	}

	

	public boolean isFilled() {
		return filled;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		GeometricObject.count = count;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public  String showinfo() {
		return "this is Geometirc Object!" + "Color : " + color + " Filled: " + filled;

	}
	
}
