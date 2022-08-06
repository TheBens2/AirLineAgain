package com.blakesley.models;

public class Ticket {
	
		// This is a POJO which details the properties of each ticket
		// Each ticket must have a name, seat number, transaction id, ticket cost and associated flight
	
		private String name;				//passenger name
		private int seatNumber;
		private int transactionID;
		private double ticketCost;
		private Flight flight;
		
		public Ticket(String name, int seatNumber, int transactionID, double ticketCost, Flight flight) {
			super();
			this.name = name;
			this.seatNumber = seatNumber;
			this.transactionID = transactionID;
			this.ticketCost = ticketCost;
			this.flight = flight;
		}
		


		
		
		
		public Ticket() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSeatNumber() {
			return seatNumber;
		}
		public void setSeatNumber(int seatNumber) {
			this.seatNumber = seatNumber;
		}
		public int getTransactionID() {
			return transactionID;
		}
		public void setTransactionID(int transactionID) {
			this.transactionID = transactionID;
		}
		public double getTicketCost() {
			return ticketCost;
		}
		public void setTicketCost(double ticketCost) {
			this.ticketCost = ticketCost;
		}
		
		public Flight getFlight() {
			return flight;
		}
		public void setFlight(Flight flight) {
			this.flight = flight;
		}
		@Override
		public String toString() {
			return "Ticket [name=" + name + ", seatNumber=" + seatNumber + ", transactionID=" + transactionID
					+ ", ticketCost=" + ticketCost + ", flight=" + flight + "]";
		}
		
		
}
