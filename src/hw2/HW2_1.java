package hw2;

public class HW2_1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1~1000的偶數和為" + sum);
	}

}
