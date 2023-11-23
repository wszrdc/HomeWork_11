package hw2;

public class HW2_5 {

	public static void main(String[] args) {
		int count = 0;
		System.out.print("可以選:");
		for(int num = 1; num <= 49 ; num++) {//為啥不直接num<=39
			if((num-4) % 10 == 0) {
				continue;
			}
			else if(num >= 40) {
				break;
			}
			count++;
			System.out.print(num + " ");
			
		}
		System.out.println("\n共" + count + "個");

	}

}
