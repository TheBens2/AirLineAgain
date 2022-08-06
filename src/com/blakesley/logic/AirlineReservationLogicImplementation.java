package com.blakesley.logic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.blakesley.models.*;
import com.blakesley.data.*;

public class AirlineReservationLogicImplementation implements AirlineReservationLogic{

	AirlineReservationData airlineReservationData;
	
	
	
	public AirlineReservationLogicImplementation(AirlineReservationData airlineReservationData) {
		super();
		this.airlineReservationData = airlineReservationData;
	}
	
	public AirlineReservationLogicImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean buyTicket(String name, int seatNumber, int flightID) {
		Flight flight = airlineReservationData.selectFlightByFlightID(flightID);	//The flight is found by the FlightID
		int transactionID = airlineReservationData.getTransactionID() + 1; 		//TransactionID updated linearly 
		airlineReservationData.setTransactionID(transactionID);					
		Double ticketCost = flight.getCostOfSeats().get(seatNumber);		//ticket cost is determined by flight and seat number
		Ticket ticket = new Ticket(name, seatNumber, transactionID, ticketCost, flight); // ticket is created
		airlineReservationData.getticketDB().add(ticket);							// ticket is added to ticket database
		flight.getSeatAvailable().put(seatNumber, false);			// seat no longer available
		return true;
	}
	
	

	@Override
	public void buyTicket(LocalDate departureDate, LocalTime departureTime) {
		// TODO Auto-generated method stub
		// Add this functionality later
	}
	@Override
	public void cancelTicketByTransactionID(int transactionID) {
		Ticket ticket = airlineReservationData.selectTicketByTransactionID(transactionID);
		this.cancelTicket(ticket);
	}
	
	
	@Override
	public void cancelTicket(Ticket ticket) {
		airlineReservationData.getticketDB().remove(ticket);	//remove the ticket from the ticketDB
		Flight flight  = ticket.getFlight();
		flight.getSeatAvailable().put(ticket.getSeatNumber(), true);	//seat is available again
	}

	@Override
	public int transactionId() {
		return airlineReservationData.getTransactionID();
		
	}

	@Override
	public boolean selectSeat(Flight flight, int seatNumber) {
		
		return false;
	}

	@Override
	public boolean isSeatAvailable(int flightID, int seatNumber) {
		Flight flight = airlineReservationData.selectFlightByFlightID(flightID);
			List<Integer> availableSeats = airlineReservationData.availableSeats(flight);
		boolean seatAvailable = false;
		for (int seat : availableSeats) {
			if (seat == seatNumber) {
				seatAvailable = true;
			}
		}
		return seatAvailable;
	}
	@Override
	public boolean flightExists(int flightID) {
		Flight flight = airlineReservationData.selectFlightByFlightID(flightID);
		return airlineReservationData.getFlightDB().contains(flight);
	}

	@Override
	public boolean ticketExists(int transactionID) {
		Ticket ticket = airlineReservationData.selectTicketByTransactionID(transactionID);
		return airlineReservationData.getticketDB().contains(ticket);
	}
	
	
	

}
