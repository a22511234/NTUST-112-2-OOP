package Week10_Practice;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 10, 20, 30 };
		for (int i = 0; i < 4; i++) {
			try {
				System.out.print("num :" + num[i]);
				System.out.println(" : 第" + (i + 1) + "次的迴圈");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("例外發生!");
			} finally {
				System.out.println("--Finally--");
			}
		}
		System.out.println("--end--");
		/*try {
            double data = 100 / 0.0;
            System.out.println("浮點數除以零：" + data); 
            if(String.valueOf(data).equals("Infinity")) 
                throw new ArithmeticException("除零例外");
        } 
        catch(ArithmeticException e) { 
            System.out.println(e); 
        } */
	}

}
