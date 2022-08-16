package com.blakesley.presentation;

import java.util.Scanner;

import com.blakesley.logic.AirlineReservationLogic;


public class AirlineReservationPresentation {
	private AirlineReservationLogic airlineReservationLogic;

	public AirlineReservationPresentation(AirlineReservationLogic airlineReservationLogic) {
		this.airlineReservationLogic = airlineReservationLogic;
	}

	public AirlineReservationPresentation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void homepage(Scanner scanner) {
		boolean interacting = true;
		while(interacting) {
			System.out.println("Select an option: " +
								"\n 1. Buy Ticket \n 2. Cancel Ticket \n 3. Exit");
			String userInput = scanner.nextLine();
			
			switch(userInput) {
			
			case "1":
				buyTicketMenu(scanner);
				break;
			case "2":
				cancelTicketWithFlightID(scanner);
				break;
			case "3":
				System.out.println("See ya later.");
				interacting = false;
				break;
			default:
				System.out.println("Invalid option. Try again.");
			}
		}
	}
	
	public void buyTicketMenu(Scanner scanner) {
		System.out.println("Do you know the flight ID?" +
							" \n 1. Yes \n 2. No");
		
		String userInput = scanner.nextLine();
		
		switch(userInput) {
		case "1":
			buyTicketWithFlightID(scanner);
			break;
		case "2":
			/*
			 *  Functionality should ask for flight details to try to find flight.
			 *  For example, departure date, time and location
			 *  This has not been implemented.
			 */
		default:
			System.out.println("Invalid option. Try again.");
		}
		
	}
	public void buyTicketWithFlightID(Scanner scanner) {
		System.out.println("Please enter Flight ID:"); //Need functionality to check if valid Flight ID
		String stringFlightID = scanner.nextLine();
		int flightID = Integer.parseInt(stringFlightID);
		if(!airlineReservationLogic.flightExists(flightID)) {
			System.out.println("This flight does not exist.");
			return;
		}
		System.out.println("Please enter your name:");
		String name = scanner.nextLine();
		System.out.println("Please enter seat number:");
		String stringSeatNumber = scanner.nextLine();
		int seatNumber = Integer.parseInt(stringSeatNumber);
		
		if(!airlineReservationLogic.isSeatAvailable(flightID, seatNumber)) {
			System.out.println("This seat is unavailable.");
			return;
		}
		airlineReservationLogic.buyTicket(name, seatNumber , flightID);
		
		System.out.println("Booking confirmed. Your transaction ID is " + 
							airlineReservationLogic.transactionId());
	}
	public void cancelTicketWithFlightID(Scanner scanner) {
		System.out.println("Please enter Flight ID:");	
		String stringFlightID = scanner.nextLine();
		int flightID = Integer.parseInt(stringFlightID);
		if(!airlineReservationLogic.flightExists(flightID)) {
			System.out.println("This flight does not exist.");
			return;
		}
		System.out.println("Please enter Transaction ID:"); // Need functionality to check if valid transaction ID
		String stringTransactionID = scanner.nextLine();
		int transactionID = Integer.parseInt(stringTransactionID);
		if(!airlineReservationLogic.ticketExists(transactionID)) {
			System.out.println("This ticket does not exist.");
			return;
		}
		airlineReservationLogic.cancelTicketByTransactionID(transactionID);
		System.out.println("Ticket cancelled.");
	}
}
