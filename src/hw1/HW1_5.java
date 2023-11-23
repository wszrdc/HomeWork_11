package hw1;

public class HW1_5 {

	public static void main(String[] args) {
		
		double principal = 1500000;
		double rate = 0.02;
		double sum = principal * Math.pow((1 + rate),10);
		
		System.out.printf("本金加利息共%.2f",sum);

	}

}
