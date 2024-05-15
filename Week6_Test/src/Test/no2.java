package Test;

public class no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 2;
		int a = 1;
		switch (input) {
		case 0:
			a++;
		case 1:
			a--;
			break;
		case 2:
			--a;
			
		case 3:
			++a;
			break;
		}
		System.out.print(a);
	}

}
