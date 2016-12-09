 package org.sistema.spring.hotel.models;

public class Guest {

	private String name;
	private String dni;
	
	public Guest(){
		
	}
	
	public Guest(String name, String dni){
		this.name= name;
		this.dni = dni;
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Guest [name=" + name + ", dni=" + dni + "]";
	}

}
