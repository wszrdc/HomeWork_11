package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		System.out.println("============用for + while =================");

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println("============用for + do while =================");
		
		for(int m = 1; m <= 9; m++) {
			int n = 1;
			do {
				System.out.print(m + "*" + n + "=" + m * n + "\t");
				n++;
			}while(n <= 9);
			System.out.println();
		}

		System.out.println("============用while + do while =================");
		int x = 1;
		while(x <= 9) {
			int y = 1;
			do {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			}while(y <= 9);
			System.out.println();
			x++;
		}

	}

}
