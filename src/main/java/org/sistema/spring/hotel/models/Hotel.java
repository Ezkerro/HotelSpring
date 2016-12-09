package org.sistema.spring.hotel.models;

import java.util.Vector;

public class Hotel {
	private String name;
	private Vector<Room> rooms;
	
	public Hotel(){
		
	}
	
	public Hotel(String name){
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rooms
	 */
	public Vector<Room> getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(Vector<Room> rooms) {
		this.rooms = rooms;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rooms=" + rooms + "]";
	}
	
	
}
