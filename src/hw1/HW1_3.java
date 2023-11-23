package hw1;

public class HW1_3 {

	public static void main(String[] args) {
		
		int day = 256559 / 86400;
		int hour = 256559 % 86400 / 3600;
		int min = 256559 % 86400 % 3600 / 60;
		int sec = 256559 % 86400 % 3600 % 60;
		
		System.out.println("256559秒為" + day + "天" + hour + "小時" + min + "分鐘" + sec + "秒");

	}

}
