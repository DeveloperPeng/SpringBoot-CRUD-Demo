package com.crud.data.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.data.entity.Hospital;

/**
 * The Interface HospitalRepository.
 */
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */
	@Query(value = "from HOSPITAL", nativeQuery = true)
	List<Hospital> getAllHospitals();

}