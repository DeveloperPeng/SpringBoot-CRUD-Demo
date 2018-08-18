package com.crud.data.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * The Class HospitalDTO.
 */
@JsonAutoDetect
public class HospitalDTO {

	/** The id. */
	private int id;
	
	/** The name. */
	private String name;
	
	/** The city. */
	private String city;
	
	/** The rating. */
	private double rating;

	/**
	 * Instantiates a new hospital DTO.
	 */
	public HospitalDTO() {
		super();
	}

	/**
	 * Instantiates a new hospital DTO.
	 *
	 * @param id
	 * @param name
	 * @param city
	 * @param rating
	 */
	public HospitalDTO(int id, String name, String city, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.rating = rating;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * Sets the rating.
	 *
	 * @param rating
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

}
