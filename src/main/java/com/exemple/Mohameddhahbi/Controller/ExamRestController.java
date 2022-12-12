package com.exemple.Mohameddhahbi.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.Mohameddhahbi.Entity.Personnel;
import com.exemple.Mohameddhahbi.Entity.Zone;
import com.exemple.Mohameddhahbi.Repository.ParkingRepo;
import com.exemple.Mohameddhahbi.Repository.PersonnelRepo;
import com.exemple.Mohameddhahbi.Repository.ZoneRepo;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping("rest")
public class ExamRestController {

	@Autowired
	private ZoneRepo zoneRepo;
	
	
	@Autowired
	private PersonnelRepo personnelRepo;
	
	@Autowired
	private ParkingRepo parkingRepo;
	
	

	
	@PostMapping("/add-personnel")
	public Personnel ajouterPersonnel(@RequestBody Personnel entity) {
		return	personnelRepo.save(entity);
	}
	
	@PostMapping("/add-parking-zone")
	public void ajoutParkingetZones() {
		
		//Parking parking = parkingRepo
		
		//System.out.println("hh");
		
	}
	
	
	
		@GetMapping("/affecterPersonnelZone/{idzone}/{idgarde}") 
		public void affecterPersonnelZone(@PathVariable int idzone, @PathVariable Integer idgarde ) {

			Zone zone =zoneRepo.findById(idzone).orElse(null);
			Personnel personnel =personnelRepo.findById(idgarde).orElse(null);

			
			personnel.setZone(zone);
			personnelRepo.save(personnel);
			
		/*	System.out.println(personnel);
			System.out.println(zone);*/


		}
	
	
	
	/*public List<Personnel>getAllPersonnelByParking(){
		
		
		
		
	}*/
		
		
		
		
		
		
		public void getNbrGardesZone() {
			
			
			
		}
	
	
		
		public Integer nombreGardeJour( @PathVariable String adresse) {
			
			return personnelRepo.nombreGardeJour(adresse);
			
			
		}
		
		
		
		public List<Personnel>getPersonnelByDate(@PathVariable Date startDate, @PathVariable Date endDate){
			
			
			
			return null;
			
		}
		
	
}
