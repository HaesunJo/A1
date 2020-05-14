package a1_Haesun;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		
		String userAnswer1, userAnswer2, userAnswer3;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Is anyone in your party a vegetarian?");
			userAnswer1 = inputDevice.nextLine();
			
		System.out.print("Is anyone in your party a vegan?");
			userAnswer2 = inputDevice.nextLine();

		System.out.print("Is anyone in your party gluten-free?");
			userAnswer3 = inputDevice.nextLine();

		System.out.print("Here are the restaurant choices: ");
		
		
		if(userAnswer3.equals("yes")) {
			
			if(userAnswer2.equals("no")) {
				System.out.println("Main Street Pizza Company");
				System.out.println("The Chef’s Kitchen");
			}
			
			System.out.println("Corner Cafe");
			
		}
		else {
			if(userAnswer1.equals("yes"))
				System.out.println("Mama Fine Italian");
			
			else
				System.out.println("Joe’s Gourmet Burgers");
		}
		
		
		
		
		

		
	}
}
