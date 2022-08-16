package com.blakesley.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.blakesley.data.AirlineReservationData;
import com.blakesley.models.Flight;

public class AirlineReservationImplTest {
	
	@Mock
	private  AirlineReservationData airlineReservationData;
	
	private AirlineReservationLogic airlineReservationLogic;
	
	@BeforeEach
	public void setupData() {
		
		
		MockitoAnnotations.initMocks(this);
		airlineReservationLogic  = new AirlineReservationLogicImplementation(airlineReservationData);
		
	}
	
	
	@Test
	public void testBuyTicket() {
		
		//Unit test is about testing the smallest unit of code in isolation 
		// In Java the smallest unit is Methods. 
		
		//With unit tests, we check that the method behaves appropriately 
		// When systems rely on other systems, we can't easily unit test a method in isolation. 
		// To overcome this, we create a fake version of the reliant system. 
		// i.e. a "mock" object 
		
		
		//Test Driven Development, where you build the tests first
		
		Flight flight = new Flight("London", "Barcelona", 150, LocalDate.of(2022,1,8),LocalDate.of(2022,1,8) , 
				LocalTime.of(10, 45), LocalTime.of(12, 55), 1, costOfSeatsFlight1 , seatAvailableFlight1);
		
		List<Flight> flightDB = new ArrayList<>();
		
		when(airlineReservationData.getFlightDB()).thenReturn(flightDB);
		
		assertEquals(airlineReservationLogic.buyTicket("bob", 1, 1), true);
//		assertEquals(airlineReservationLogic.buyTicket("bob", 1, 1), false);
		
//		This should throw an exception
//		assertThrows( airlineReservationLogic.buyTicket("bob", 0, 0), new NullPointerException());
		
		
		
		
	}

}
