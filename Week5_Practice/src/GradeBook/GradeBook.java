package GradeBook;

import java.util.Scanner;

public class GradeBook {

	private double grade[];

	public GradeBook(int count) {
		grade = new double[count];
	}

	public void setGrade() {
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入 " + grade.length + " 位同學成績：");
		for (int i = 0; i < grade.length; i++) {
			System.out.print("請輸入第 " + (i + 1) + " 位同學成績：");
			grade[i] = input.nextDouble();
		}
	}

	public void showGrade() {
		for (int i = 0; i < grade.length; i++) {
			System.out.printf("請輸入第 " + (i + 1) + " 位同學成績為：%.2f \n", grade[i]);
		}
	}

	public double getMean() {
		double sum = 0;
		for (int i = 0; i < grade.length; i++) {
			sum += grade[i];
		}
		double mean = sum / grade.length;
		return mean;
	}

	public double getMax() {
		double max = Double.MIN_VALUE;
		for (double i : grade) {
			if (i > max)
				max = i;
		}
		return max;
	}

	public int getPassCount() {
		int count = 0;
		for (double i : grade) {
			if (i >= 60)
				count++;
		}
		return count;
	}
}
