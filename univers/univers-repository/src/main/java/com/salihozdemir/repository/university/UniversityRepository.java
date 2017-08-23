package com.salihozdemir.repository.university;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salihozdemir.model.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer>{

	@Query("select u from University u order by u.universityName")
	List<University> getAllUniversities();
}
