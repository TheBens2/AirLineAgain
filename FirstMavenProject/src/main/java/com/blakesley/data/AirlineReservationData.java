package com.blakesley.data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.blakesley.models.Flight;
import com.blakesley.models.Ticket;



public interface AirlineReservationData {
		// This interface tells us everything about the data in the Airline reservation system
		
		//Insert things
		public boolean insert(Ticket ticket);
	
		//Read things
		public List<Ticket> selectTicketsByName(String name);
		public Ticket selectTicketByTransactionID(int transactionID);
		public Ticket selectTicketBySeatNumber(int seatNumber);
		
		public Flight selectFlightByFlightID(int flightID);
		public List<Flight> findFlightsLeavingOnDate(LocalDate departureDate);
		public List<Flight> findFlightsArrivingOnDate(LocalDate arrivalDate);
		public List<Flight> findFlightsDepartingFrom(String departureLocation);
		public List<Flight> findFlightsArrivingAt(String arrivalLocation);	
		public int findFlightID();
		
		public List<Ticket> selectAllTicketsOnFlight(Flight flight);
		
		public int totalTicketsSoldForFlight(Flight flight);
		public double totalRevenueForFlight(Flight flight);
		
		
		
		//Update things
		public Ticket changeSeat(Ticket ticket);
	
		//Delete things
		
		//Access things
		void setFlightDB(List<Flight> flightDB);
		List<Flight> getFlightDB();
		
		void setTicketDB(List<Ticket> ticketDB);
		List<Ticket> getticketDB();
		
		void setTransactionID(int transactionID);
		int getTransactionID();
		
		//check things
		
		
		public List<Integer> availableSeats(Flight flight);

	
		
		
		
}
