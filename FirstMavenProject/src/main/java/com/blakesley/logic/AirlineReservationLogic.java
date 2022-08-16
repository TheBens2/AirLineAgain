package com.blakesley.logic;

import com.blakesley.models.Flight;
import com.blakesley.models.Ticket;

import java.time.LocalDate;
import java.time.LocalTime;

import com.blakesley.data.AirlineReservationData;


public interface AirlineReservationLogic {

	// This interface should include all business logic
	/*
	 * Buying ticket
	 * Cancel ticket
	 * Retrieve flight information
	 */
	
	
	
	public boolean buyTicket(String name, int seatNumber, int flightID);
	public void buyTicket(LocalDate departureDate, LocalTime departureTime);
	
	public boolean selectSeat(Flight flight, int seatNumber);
	
	public void cancelTicket(Ticket ticket);
	public void cancelTicketByTransactionID(int transactionID);
	
	public boolean flightExists(int flightID);
	public boolean isSeatAvailable(int flightID, int seatNumber);
	
	public boolean ticketExists(int transactionID);
	
	public int transactionId();
	
}
