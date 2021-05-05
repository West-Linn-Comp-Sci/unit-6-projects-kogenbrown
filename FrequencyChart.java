import java.util.Scanner;

public class FrequencyChart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0, count10 = 0, count20 = 0, count30 = 0, count40 = 0, count50 = 0, count60 = 0, count70 = 0, count80 = 0, count90 = 0, count100 = 0;
		System.out.println("Enter any amount of numbers from 1-100 and then enter 0 to stop");
		while(sc.hasNext()) {
			temp = sc.nextInt();
			if(temp >=1 && temp<=10) {
				count10++;
			} else if (temp >= 11 && temp <=20) {
				count20++;
			} else if (temp >= 21 && temp <=30) {
				count30++;
			} else if (temp >= 31 && temp <=40) {
				count40++;
			} else if (temp >= 41 && temp <=50) {
				count50++;
			} else if (temp >= 51 && temp <=60) {
				count60++;
			} else if (temp >= 61 && temp <=70) {
				count70++;
			} else if (temp >= 71 && temp <=80) {
				count80++;
			} else if (temp >= 81 && temp <=90) {
				count90++;
			} else if (temp >= 91 && temp <=100) {
				count100++;
			} else if (temp==0) break;
		}
		System.out.print("\n  1-10  | ");
		for (int i = 0; i < count10; i++) {
			System.out.print("*");
		}
		System.out.print("\n 11-20  | ");
		for (int i = 0; i < count20; i++) {
			System.out.print("*");
		}
		System.out.print("\n 21-30  | ");
		for (int i = 0; i < count30; i++) {
			System.out.print("*");
		} 
		System.out.print("\n 31-40  | ");
		for (int i = 0; i < count40; i++) {
			System.out.print("*");
		}
		System.out.print("\n 41-50  | ");
		for (int i = 0; i < count50; i++) {
			System.out.print("*");
		}
		System.out.print("\n 51-60  | ");
		for (int i = 0; i < count60; i++) {
			System.out.print("*");
		}
		System.out.print("\n 61-70  | ");
		for (int i = 0; i < count70; i++) {
			System.out.print("*");
		}
		System.out.print("\n 71-80  | ");
		for (int i = 0; i < count80; i++) {
			System.out.print("*");
		}
		System.out.print("\n 81-90  | ");
		for (int i = 0; i < count90; i++) {
			System.out.print("*");
		}
		System.out.print("\n 91-100 | ");
		for (int i = 0; i < count100; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
