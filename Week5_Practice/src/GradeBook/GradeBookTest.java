package GradeBook;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入人數：");
		int num = input.nextInt();
		GradeBook gradeBook = new GradeBook(num);
		gradeBook.setGrade();
		System.out.println("--------------我是分隔線--------------");
		gradeBook.showGrade();
		System.out.printf("平均： %.2f \n",gradeBook.getMean());
		System.out.printf("最大值： %.2f \n",gradeBook.getMax());
		System.out.println("及格人數："+gradeBook.getPassCount());

	}

}
