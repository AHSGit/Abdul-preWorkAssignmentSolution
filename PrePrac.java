

import java.util.Scanner;

public class PrePrac {
	
	Scanner sc = new Scanner(System.in);
	
	public void checkPalindrome() {
		
		System.out.println("\nPlease enter number for Palindrome check:");
		int num = sc.nextInt();
		int num2 = num, rnum = 0, rem;
		do { rem = num2%10; 																		//To reverse entered number
			 rnum = rnum*10 + rem;
			 num2 = num2/10;		
		} while (num2>0);
		
		if (rnum==num)																				//To compare entered and reversed numbers 
			System.out.println("\nEntered number IS a Palindrome!");
		else 
		System.out.println("\nEntered number is NOT a Palindrome!");
		
		System.out.println("-------------------------------------------------");
	}
	
	
	public void printPattern() {
		
		System.out.println("\nPlease enter number of lines for pattern:");
		int num = sc.nextInt();
		System.out.println();
		if (num==0) {System.out.println("Nothing to print!"); 									//To alert user in case zero is entered
		System.out.println("-------------------------------------------------"); return; }
		else {
		do { int i=num;																			
			
			do { System.out.print("*"); i--;} 													//Nested loop to print a single line of pattern
			while (i>0); 
		
		System.out.println(); num--;} while (num>0);												//Main loop to move to next line
		}
		
	}
	  
	  
	public void checkPrimeNumber() {

       System.out.println("\nPlease enter number for Prime check:");
	   int num = sc.nextInt();
	   int count=0, n=1;
	   
	   do { if (num%n == 0){																		//Loop to divide number by all natural numbers before and including it
	   count++;}
		   n++;		   
		} while (n<=num);
		
		if (count == 2) System.out.println("\nThe number " + num + " IS a Prime number!");
		else System.out.println("\nThe number " + num + " is NOT a Prime number!");
		
		System.out.println("-------------------------------------------------");
		
	}
		
		
	public void printFibonacciSeries() {
			
		System.out.println("\nPlease enter a number to generate Fibonacci series upto nth term:");
		int n = sc.nextInt();
		int num1 = 0, num2 = 1, num;																//Initialised first two terms as hardcoded
		System.out.print("\nThe first " + n + " terms of the Fibonacci series are: " + num1 + ", " + num2 + ", ");
		n = n-2;																					//Eliminating 2 from entered number as first two already harcoded
		do { num = num1+num2;			 
			 System.out.print(num); 
			 num1 = num2;
			 num2 = num;
			 n--;
			 if (n!=0) System.out.print(", ");														//Conditional statement to correct line end punctuation (optional)
			 else System.out.print(".\n");
			 
		} while (n>0);   
		
		System.out.println("-------------------------------------------------");
    }
	
	
	public static void main (String args[]) {
		
		    PrePrac obj = new PrePrac();
            int choice;
			Scanner sc = new Scanner(System.in);

			do { 
			
				System.out.println("\nPlease enter your choice from list below:\n" + "1. Check if number is a Palindrome.\n" + "2. Print Pattern for entered number.\n" + "3. Check whether entered number is a Prime number.\n" + "4. Print Fibonacci series upto nth term.\n" + "--> Enter 0 to Exit.\n");
				choice = sc.nextInt();
			
				switch (choice) {
				
					case 0:
					choice = 0;
					break;
				
					case 1: {obj.checkPalindrome();}
					break;
				
					case 2: {obj.printPattern();}
					break;
				
					case 3: {obj.checkPrimeNumber();}
					break;
				
					case 4: {obj.printFibonacciSeries();}
					break;
				
					default: System.out.println("\nInvalid choice! Please enter a valid number from given options!");
					System.out.println("-------------------------------------------------");
				
				} 
			
			} while (choice != 0);
				
			System.out.println("\nExited Successfully!");
			System.out.println("-------------------------------------------------");
			sc.close();		
		
	}
	
}	