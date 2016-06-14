import java.util.Scanner;
public class WhatIfActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		int customerNum;
		int salesAmount;
		String customerName;
		String taxCode;
		double taxAmount = 0;
		double totalSales=0;
		
		// Asks user for sales record inputs and sets variable equal to the results
		System.out.println("Enter customer number");
		customerNum= keyboard.nextInt();
		System.out.print("Enter Customer Name");
		customerName = keyboard.next();
		System.out.println("Enter taxcode: NRM, NPF, or BIZ");
		taxCode=keyboard.next();
		System.out.println("Enter the sales amount");
		salesAmount = keyboard.nextInt();
		
		//Assigns tax based on tax code entered
		if (taxCode.equals("NRM")){
			taxAmount = .06;
		}
		else if (taxCode.equals("NPF")){
			taxAmount=0.0;
		}
		else if (taxCode.equals("BIZ")){
			taxAmount=.045;	
	    }
       //System.out.print(taxAmount);
		totalSales = salesAmount+(salesAmount*taxAmount);
		
		//Prints Results
		System.out.println(customerName + " Customer Number "+customerNum);
		System.out.println("Sales amount:"+ salesAmount +" Tax percent added " + taxAmount );
		System.out.println("Taxes owed " +salesAmount*taxAmount );
		System.out.println("Total sales: "+ totalSales);
    }
}