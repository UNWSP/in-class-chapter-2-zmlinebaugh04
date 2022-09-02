package ch2a_2;

import java.util.Scanner;

public class calcTwinsTix {
	public static void main(String[] args) {
		int ticketprice = 75;
		int processingfee = 20;
		double salestax = .07;
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter number of tickets: ");
		
		String ticketcount = userinput.nextLine();
		int ticketvalue = Integer.parseInt(ticketcount);
		//System.out.println("Ticket count is " + ticketcount);
		int subtotal = (ticketprice * ticketvalue) + processingfee;
		double tax = subtotal * salestax;
		double total = tax + subtotal;
		System.out.println("Your total is $" + total);
	}
}
