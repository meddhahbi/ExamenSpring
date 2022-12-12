package com.exemple.Mohameddhahbi.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Parking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;
	private String adresse;
	private int capacite;
	
	
	@OneToMany(mappedBy="parking")
	private List<Zone> zone;
	
	
	
}
