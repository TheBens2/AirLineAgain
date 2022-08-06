package com.blakesley;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.blakesley.data.AirlineReservationData;
import com.blakesley.data.AirlineReservationDataImplementation;
import com.blakesley.logic.AirlineReservationLogic;
import com.blakesley.logic.AirlineReservationLogicImplementation;
import com.blakesley.models.*;
import com.blakesley.presentation.AirlineReservationPresentation;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Double> costOfSeatsFlight1 = new HashMap<Integer,Double>();
		for (int i = 1; i < 151; i++ ) {
			costOfSeatsFlight1.put(i, (double) 100);
		}
		Map<Integer, Boolean> seatAvailableFlight1 = new HashMap<Integer, Boolean>();
		for (int i = 1; i < 151; i++ ) {
			seatAvailableFlight1.put(i, true);
		}
		Flight flight = new Flight("London", "Barcelona", 150, LocalDate.of(2022,1,8),LocalDate.of(2022,1,8) , 
				LocalTime.of(10, 45), LocalTime.of(12, 55), 1, costOfSeatsFlight1 , seatAvailableFlight1);
		
		List<Flight> flightDB = new ArrayList<>();
		flightDB.add(flight);
		List<Ticket> ticketDB = new ArrayList<>();
		AirlineReservationData aData = new AirlineReservationDataImplementation(flightDB, ticketDB,  0);
		
		AirlineReservationLogic aLogic = new AirlineReservationLogicImplementation(aData);
		
		AirlineReservationPresentation aPres = new AirlineReservationPresentation(aLogic);
		
		Scanner scanner = new Scanner(System.in);
		
		aPres.homepage(scanner);
		
		scanner.close();
		
		
		
	}

}
