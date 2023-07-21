package com.airport;

import java.util.ArrayList;

public class Airport {
	Address address;
	ArrayList<Flight> flights;
	ArrayList<Traveller> travellers;
	
	
	public Airport() {
		travellers = new ArrayList<>();
	}
	

	public Airport(Address address, ArrayList<Flight> flights, ArrayList<Traveller> travellers) {
		super();
		this.address = address;
		this.flights = flights;
		this.travellers = travellers;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public ArrayList<Flight> getFlights() {
		return flights;
	}


	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}


	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}


	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}


	public boolean addFlight(Flight flight) {
		if(!flights.contains(flight)) {
			flights.add(flight);
			return true;
		}
		return false;
	}
	
	public ArrayList<Flight> searchFlightsBySourceAndDestination(String source,String destination){
		ArrayList<Flight> searchResults = new ArrayList<>();
		for(Flight f: flights) {
			if(f.getDestination().equals(destination) && f.getSource().equals(source)) {
				searchResults.add(f);
			}
		}
		return searchResults;
	}
	
	public void bookTicket(String flightId, Traveller traveller) {
		for(Flight f:flights) {
			if(f.getId()==flightId && f.getAvailableSeats()>=1) {
				System.out.println("...");
				f.setAvailableSeats(f.getAvailableSeats()-1);
				travellers.add(traveller);
			}
		}
	}
}
