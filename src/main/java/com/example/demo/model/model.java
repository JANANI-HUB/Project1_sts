package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class model {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="mobile")
	private long mobile;
	@Column(name="date")
	private String date;
	@Column(name="source")
	private String source;
	@Column(name="destination")
	private String destination;
	@Column(name="tickets")
	private int tickets;
	@Column(name="type")
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
public void setName(String name) {
	this.name = name;
	}
public long getMobile() {
		return mobile;
	}

public void setMobile(long mobile) {
		this.mobile = mobile;
	}
public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
public String getSource() {
		return source;
	}

public void setSource(String source) {
		this.source = source;
	}

public String getDestination() {
		return destination;
	}

public void setDestination(String destination) {
		this.destination = destination;
	}
public int getTickets() {
		return tickets;
	}

public void setTickets(int tickets) {
		this.tickets = tickets;
	}
public String getType() {
		return type;
	}

public void setType(String type) {
		this.type = type;
	}
public model( int id,String name,long mobile, String date, String source, String destination, int tickets, String type) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.date = date;
	this.source = source;
	this.destination = destination;
	this.tickets = tickets;
	this.type = type;
}

public model() {
		
	}
	
}
