package com.ejerciciopoo.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skill {
	@Id
	@GeneratedValue
	private int id;
	private String habilidad;
	
	@ManyToOne
	private ArrayList< Ranking> ranking;
	
	
	public Skill() {
	}
	
	

	public Skill(String habilidad) {
		super();
		this.habilidad = habilidad;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
}
