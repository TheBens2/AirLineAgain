package com.blakesley.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class Flight {
			
	// This is a POJO which describes the flight
	// Each flight requires a beginning, destination, number of seats, time and date of departure
	// and landing
	
	private String departureLocation;		
	private String destination;
	private int numberOfSeats;				
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	private LocalTime departureTime;
	private LocalTime arrivalTime;
	private int flightID;					// Each flight should have a unique flight ID
	private Map<Integer, Double> costOfSeats;	// Stores the info of cost of each seat
	private Map<Integer, Boolean> seatAvailable;	// Stores info regarding if particular seat available
	
	
	
	
	
	
	public Flight(String departureLocation, String destination, int numberOfSeats, LocalDate departureDate,
			LocalDate arrivalDate, LocalTime departureTime, LocalTime arrivalTime, int flightID, Map<Integer, Double> costOfSeats,
			Map<Integer, Boolean> seatAvailable) {
		super();
		this.departureLocation = departureLocation;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightID = flightID;
		this.costOfSeats = costOfSeats;
		this.seatAvailable = seatAvailable;
	}

	


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getDepartureLocation() {
		return departureLocation;
	}




	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}




	public String getDestination() {
		return destination;
	}




	public void setDestination(String destination) {
		this.destination = destination;
	}




	public int getNumberOfSeats() {
		return numberOfSeats;
	}




	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}




	public LocalDate getDepartureDate() {
		return departureDate;
	}




	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}




	public LocalDate getArrivalDate() {
		return arrivalDate;
	}




	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}




	public LocalTime getDepartureTime() {
		return departureTime;
	}




	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}




	public LocalTime getArrivalTime() {
		return arrivalTime;
	}




	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}




	public int getFlightID() {
		return flightID;
	}




	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}




	@Override
	public String toString() {
		return "Flight [departureLocation=" + departureLocation + ", destination=" + destination + ", numberOfSeats="
				+ numberOfSeats + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", flightID=" + flightID + "]";
	}




	public Map<Integer, Double> getCostOfSeats() {
		return costOfSeats;
	}




	public void setCostOfSeats(Map<Integer, Double> costOfSeats) {
		this.costOfSeats = costOfSeats;
	}




	public Map<Integer, Boolean> getSeatAvailable() {
		return seatAvailable;
	}




	public void setSeatAvailable(Map<Integer, Boolean> seatAvailable) {
		this.seatAvailable = seatAvailable;
	}




	
	
	
	
	
	
}
