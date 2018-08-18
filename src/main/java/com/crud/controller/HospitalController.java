package com.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.data.entity.Hospital;
import com.crud.service.HospitalService;


/**
 * The Class HospitalController.
 */
@RestController
@RequestMapping("/test/")
public class HospitalController {
	
	/**
	 * Logger Instance.
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(HospitalController.class);
	
	/** The hospital service. */
	@Autowired
	private HospitalService hospitalService;

	/** The hospital List*/
	List<Hospital> hosp = new ArrayList<Hospital>();

	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 * @throws Exception the exception
	 */
	@RequestMapping(value = "/hospitals", method = RequestMethod.GET)
	public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		LOGGER.info("In HospitalController - getAllHospitals method");
		/*hosp = hospitalService.getAllHospitals();
		return hosp;*/
		return hospitalService.getAllHospitals();
	}

	/**
	 * Adds hospital.
	 *
	 * @param hospital
	 * @return the string
	 */
	@RequestMapping(value = "/addHosp", method = RequestMethod.POST)
	public @ResponseBody String addHosp(@RequestBody Hospital hospital) {
		LOGGER.info("In HospitalController - addHosp method");
		hospitalService.addHospital(hospital);
		return "hospital is added.";
	}

	/**
	 * Update hospital.
	 *
	 * @param id
	 * @param hospital
	 * @return the string
	 */
	@RequestMapping(value = "/hospital/{id}", method = RequestMethod.PUT)
	public String updateHospital(@PathVariable(value = "id") int id,
			@RequestBody Hospital hospital) {
		LOGGER.info("In HospitalController - updateHospital method");
		
		Hospital currentHospital = hospitalService.findHospById(id);

		if (currentHospital == null) {
			return "Error occured while updating";
		}

		currentHospital.setName(hospital.getName());
		currentHospital.setCity(hospital.getCity());
		currentHospital.setRating(hospital.getRating());

		hospitalService.updateHospital(currentHospital);

		return "Hospital details edited successfully.";
	}

	/**
	 * Delete hospital.
	 *
	 * @param id
	 * @return the string
	 */
	@RequestMapping(value = "/deleteHospital/{id}", method = RequestMethod.DELETE)
	public String deleteHospital(@PathVariable(value = "id") int id) {
		LOGGER.info("In HospitalController - deleteHospital method");

		Hospital currentHospital = hospitalService.findHospById(id);

		if (currentHospital == null) {
			return "Error occured while deleting";
		}

		hospitalService.deleteHospital(id);

		return "Hospital details deleted.";
	}

}