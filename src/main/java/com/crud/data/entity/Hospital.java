package com.crud.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The Class Hospital.
 */
@Entity
@Table(name = "HOSPITAL")
public class Hospital {

	/** The id. */
	@Id
	@SequenceGenerator(name = "HOSPITAL_ID", sequenceName = "hospital_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOSPITAL_ID")
	@Column(name = "ID")
	private int id;

	/** The name. */
	@Column(name = "NAME")
	private String name;

	/** The city. */
	@Column(name = "CITY")
	private String city;

	/** The rating. */
	@Column(name = "RATING")
	private double rating;

	/**
	 * Instantiates a new hospital.
	 */
	public Hospital() {

	}

	/**
	 * Instantiates a new hospital.
	 *
	 * @param id
	 * @param name
	 * @param city
	 * @param rating
	 */
	public Hospital(int id, String name, String city, double rating) {
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
	 * @param id the new id
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

	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", city=" + city
				+ ", rating=" + rating + "]";
	}

}