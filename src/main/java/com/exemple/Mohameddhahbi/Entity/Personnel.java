package com.exemple.Mohameddhahbi.Entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Personnel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private int age;
	@Temporal(TemporalType.DATE)
	private Date deteDeRecrutement;
	private String login;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Poste poste;
	
	
	@OneToOne(mappedBy="personnel")
	private Zone zone;
	
	
	
}
