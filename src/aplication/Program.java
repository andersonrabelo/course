package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Acount;

public class Program 
{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Acount acount;
		
		System.out.print("Enter acount number: ");
		int number = sc.nextInt();
		System.out.print("Enter acount holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit value (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') 
		{
			System.out.print("Enter initial deposit value: ");
			double InitialDeposit = sc.nextDouble();
			acount = new Acount(number, holder, InitialDeposit);
	
		} else 
		{
			acount = new Acount(number, holder);
		}
		
		System.out.println();
		System.out.println("Acount Data");
		System.out.println(acount);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acount.Deposit(deposit);
		System.out.println("Updated Acount Data");
		System.out.println(acount);	
		
		System.out.println();
		System.out.printf("%nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acount.Withdraw(withdraw);
		System.out.println("Updated Acount Data");
		System.out.println(acount);	
		
		sc.close();
	}

}
