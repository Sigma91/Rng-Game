package Zadatak3;

import java.util.Random;
import java.util.Scanner;

public class Rng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner unos = new Scanner(System.in);
	        Random randomGenerator = new Random();
	        
	        
	        int Br = -1;
	        
	        
	        
			int SecretNumber = randomGenerator.nextInt(10);
		
			while (Br != SecretNumber) {
				
			System.out.println("Pogodite pravi broj");
			int Broj = unos.nextInt();
				
				 
			if(Broj < SecretNumber) {
					System.out.println("Guess is lower than number!");
				}
	        if(Broj > SecretNumber) {
					System.out.println("Guess is higher than number!");
				} 
			if (Broj == SecretNumber) {
					System.out.println("Congrats!");
					break;
				}else {
					
	        
	        		}
	 }

	}
}
