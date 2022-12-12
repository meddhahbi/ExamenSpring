package com.exemple.Mohameddhahbi.Entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Zone {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ref;
	private float dimension;
	
	@ManyToOne
	private Parking parking;
	
	
	@OneToOne
	private Personnel personnel;
	
	
	@OneToMany()
	private List<Personnel>personnels;
	
	
	
	
	
}
