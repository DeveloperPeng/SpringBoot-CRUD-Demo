package com.crud.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.crud.data.entity.Hospital;

/**
 * Service class for the Hospital.
 */
public interface HospitalService {
	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */
	public List<Hospital> getAllHospitals();

	/**
	 * Adds the hospital.
	 *
	 * @param hospital
	 */
	public void addHospital(Hospital hospital);

	/**
	 * Find hosp by id.
	 *
	 * @param id
	 * @return the hospital
	 */
	public Hospital findHospById(int id);

	/**
	 * Update hospital.
	 *
	 * @param hospital
	 */
	public void updateHospital(Hospital hospital);

	/**
	 * Delete hospital.
	 *
	 * @param id
	 */
	public void deleteHospital(int id);
}
