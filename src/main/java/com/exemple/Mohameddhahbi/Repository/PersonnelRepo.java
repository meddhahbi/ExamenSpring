package com.exemple.Mohameddhahbi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exemple.Mohameddhahbi.Entity.Parking;
import com.exemple.Mohameddhahbi.Entity.Personnel;

public interface PersonnelRepo extends JpaRepository<Personnel, Integer> {

	
	
	//public List<Personnel>findPersonnelByDate
	
	@Query("SELECT COUNT(p) FROM Personnel pe INNER JOIN  Zone z ON pe.id = z.personnel_id INNER JOIN Parking p ON p.id = z.parking_id where poste LIKE 'garde jour'")
	Integer  nombreGardeJour(@Param(value = "adresse") String adesse);
	
	
}
