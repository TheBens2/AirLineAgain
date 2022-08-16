package com.blakesley.data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.blakesley.models.Flight;
import com.blakesley.models.Ticket;

public class AirlineReservationDataImplementation implements AirlineReservationData{
	
	List<Flight> flightDB = new ArrayList<>();		// List of all flights
	List<Ticket> ticketDB = new ArrayList<>();		// List of all tickets
	int transactionID;
	
	
	






	public int getTransactionID() {
		return transactionID;
	}



	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}



	public AirlineReservationDataImplementation(List<Flight> flightDB, List<Ticket> ticketDB, int transactionID) {
		super();
		this.flightDB = flightDB;
		this.ticketDB = ticketDB;
		this.transactionID = 0;
	}
	
	

	public AirlineReservationDataImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean insert(Ticket ticket) {
		
		return ticketDB.add(ticket);			// adds ticket to list of tickets
	}

	@Override
	public List<Ticket> selectTicketsByName(String name) {
//		List<Ticket> ticketsBelongingToCustomer = new ArrayList<>();
//													// Loops through tickets and find all that 
//													// belong to same customer.
//		for (Ticket ticket : ticketDB) {			// (Assumes all customers have different names)
//			if (ticket.getName().equals(name)) {	
//				ticketsBelongingToCustomer.add(ticket);
//			}
//		}
//		return ticketsBelongingToCustomer;
		
		return null;
	}

	@Override
	public Ticket selectTicketByTransactionID(int transactionID) {
//		Ticket desiredTicket = null;
//		for (Ticket ticket : ticketDB) {
//			if (ticket.getTransactionID() == transactionID) {
//				desiredTicket = ticket;
//			}
//		}
//		return desiredTicket;
		return null;
	}

	@Override
	public Ticket selectTicketBySeatNumber(int seatNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight selectFlightByFlightID(int flightID) {
		Flight desiredFlight = null;
		for (Flight flight : flightDB) {
			if(flight.getFlightID() == flightID) {
				desiredFlight = flight;
			}
		}
		return desiredFlight;
	}

	@Override
	public List<Flight> findFlightsLeavingOnDate(LocalDate departureDate) {
		List<Flight> flightsOnDate = new ArrayList<>();
		for (Flight flight : flightDB) {
			if(flight.getDepartureDate().equals(departureDate)) {
				flightsOnDate.add(flight);
			}
		}
		
		return flightsOnDate;
	}

	@Override
	public List<Flight> findFlightsArrivingOnDate(LocalDate arrivalDate) {
		List<Flight> flightsOnDate = new ArrayList<>();
		for (Flight flight : flightDB) {
			if(flight.getArrivalDate().equals(arrivalDate)) {
				flightsOnDate.add(flight);
			}
		}
		
		return flightsOnDate;
	}

	@Override
	public List<Flight> findFlightsDepartingFrom(String departureLocation) {
		List<Flight > flightsFromLocation = new ArrayList<>();
		for (Flight flight : flightDB) {
			if(flight.getDepartureLocation().equals(departureLocation)) {
				flightsFromLocation.add(flight);
			}
		}
		
		return flightsFromLocation;
		
	}

	@Override
	public List<Flight> findFlightsArrivingAt(String arrivalLocation) {
		List<Flight> flightsArrivingAtLocation = new ArrayList<>();
		for (Flight flight : flightDB) {
			if(flight.getDestination().equals(arrivalLocation)) {
				flightsArrivingAtLocation.add(flight);
			}
		}
		return flightsArrivingAtLocation;
	}

	@Override
	public int findFlightID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ticket> selectAllTicketsOnFlight(Flight flight) {
		List<Ticket> ticketsForFlight = new ArrayList<>();
		for (Ticket ticket : ticketDB) {
			if (ticket.getFlight().equals(flight)) {
				ticketsForFlight.add(ticket);
			}
		}
		return ticketsForFlight;
	}

	@Override
	public int totalTicketsSoldForFlight(Flight flight) {
		int ticketsSold = 0;
		for (Ticket ticket : ticketDB) {
			if (ticket.getFlight().equals(flight)) {
				ticketsSold ++;
			}
		}
		return ticketsSold;
	}

	@Override
	public double totalRevenueForFlight(Flight flight) {
		double revenueForFlight = 0;
		for (Ticket ticket : ticketDB) {
			if (ticket.getFlight().equals(flight)) {
				revenueForFlight = revenueForFlight + ticket.getTicketCost();
			}
		}
		return revenueForFlight;
	}

	@Override
	public Ticket changeSeat(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setFlightDB(List<Flight> flightDB) {
		this.flightDB = flightDB;
		
	}



	@Override
	public List<Flight> getFlightDB() {
		
		return flightDB;
	}






	@Override
	public List<Ticket> getticketDB() {
		
		return ticketDB;
	}



	@Override
	public void setTicketDB(List<Ticket> ticketDB) {
		this.ticketDB = ticketDB;
		
	}


	@Override
	public List<Integer> availableSeats(Flight flight) {
		List<Integer> availableSeats = new ArrayList<>(); // empty array to start
		for (Map.Entry<Integer, Boolean> entry : flight.getSeatAvailable().entrySet()) {
			if(entry.getValue()) {
				availableSeats.add(entry.getKey());
			}
		}
		
		return availableSeats;
	}



	


	

}
