package tugasPbo;

import java.util.Scanner;

public class StudyPage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double gallons;
		
		System.out.println("konversi dari galon ke liter");
		System.out.println("silahkan isi nilai dari galon : ");
		
		gallons = scan.nextDouble();
		
		double liters;		

		liters = gallons *3.785;

		System.out.println(gallons + " galon sama dengan " + liters + " liter.");
	}

}
