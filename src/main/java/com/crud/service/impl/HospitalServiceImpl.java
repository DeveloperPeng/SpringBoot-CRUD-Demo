package com.crud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.data.entity.Hospital;
import com.crud.data.repository.HospitalRepository;
import com.crud.service.HospitalService;

/**
 * The Class HospitalServiceImpl.
 */
@Service
public class HospitalServiceImpl implements HospitalService {
	
	/**
	 * Logger Instance.
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(HospitalServiceImpl.class);
	
	/** The hospital repository. */
	@Autowired
	private HospitalRepository hospitalRepository;

	/** 
	 * @see com.crud.service.HospitalService#getAllHospitals()
	 */
	public List<Hospital> getAllHospitals() {
		LOGGER.info("In HospitalServiceImpl - getAllHospitals method");
		List<Hospital> hospitals = new ArrayList<>();
		hospitalRepository.findAll().forEach(hospitals::add);
		return hospitals;
	}

	/** 
	 * @see com.crud.service.HospitalService#addHospital(com.crud.data.entity.Hospital)
	 */
	public void addHospital(Hospital hospital) {
		LOGGER.info("In HospitalServiceImpl - addHospital method");
		hospitalRepository.save(hospital);
	}

	/** 
	 * @see com.crud.service.HospitalService#findHospById(int)
	 */
	public Hospital findHospById(int id) {
		LOGGER.info("In HospitalServiceImpl - findHospById method");
		return hospitalRepository.findOne(id);
	}

	/** 
	 * @see com.crud.service.HospitalService#updateHospital(com.crud.data.entity.Hospital)
	 */
	public void updateHospital(Hospital hospital) {
		LOGGER.info("In HospitalServiceImpl - updateHospital method");
		addHospital(hospital);
	}

	/** 
	 * @see com.crud.service.HospitalService#deleteHospital(int)
	 */
	public void deleteHospital(int id) {
		LOGGER.info("In HospitalServiceImpl - deleteHospital method");
		hospitalRepository.delete(id);
	}

}