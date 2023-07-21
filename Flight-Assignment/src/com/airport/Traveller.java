package com.airport;

import java.time.LocalDate;

public class Traveller {
	private String name;
	private Long mobile;
	private String email;
	private String flightId;
	private LocalDate date;
	public Traveller() {
		super();
	}
	public Traveller(String name, Long mobile, String email, String flightId, LocalDate date) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightId = flightId;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Traveller [name=" + name + ", mobile=" + mobile + ", email=" + email + ", flightId=" + flightId
				+ ", date=" + date + "]";
	}
	
	
}
