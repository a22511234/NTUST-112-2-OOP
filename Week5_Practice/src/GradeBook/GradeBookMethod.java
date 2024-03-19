package GradeBook;

import java.util.Scanner;

public class GradeBookMethod {
	static Scanner input = new Scanner(System.in);
	static double grade[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入人數：");
		int num = input.nextInt();
		grade=new double[num];
		setGrade();
		System.out.println("--------------我是分隔線--------------");
		showGrade();
		System.out.printf("平均： %.2f \n", getMean());
		System.out.printf("最大值： %.2f \n", getMax());
		System.out.println("及格人數：" + getPassCount());
	}

	public static void setGrade() {
		System.out.println("請輸入 " + grade.length + " 位同學成績：");
		for (int i = 0; i < grade.length; i++) {
			System.out.print("請輸入第 " + (i + 1) + " 位同學成績：");
			grade[i] = input.nextDouble();
		}
	}

	public static void showGrade() {
		for (int i = 0; i < grade.length; i++) {
			System.out.printf("請輸入第 " + (i + 1) + " 位同學成績為：%.2f \n", grade[i]);
		}
	}

	public static double getMean() {
		double sum = 0;
		for (int i = 0; i < grade.length; i++) {
			sum += grade[i];
		}
		double mean = sum / grade.length;
		return mean;
	}

	public static double getMax() {
		double max = Double.MIN_VALUE;
		for (double i : grade) {
			if (i > max)
				max = i;
		}
		return max;
	}

	public static int getPassCount() {
		int count = 0;
		for (double i : grade) {
			if (i >= 60)
				count++;
		}
		return count;
	}

}
