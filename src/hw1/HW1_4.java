package hw1;

public class HW1_4 {

	public static void main(String[] args) {
		
		final double PI = 3.1415;
		
		double area = 5 * 5 * PI;
		double perimeter = 5 * 2 * PI;
		
//		System.out.println("一個半徑為5的圓面積為" + area + "周常為" + perimeter);
		System.out.printf("一個半徑為5的圓面積為%.2f周長為%.2f", area, perimeter);

	}

}
