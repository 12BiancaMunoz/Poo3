package com.ejerciciopoo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ranking {
	@Id
	@GeneratedValue
	private int id;
	private Integer ranking;
	@OneToMany
	private Persona persona;
	@OneToMany
	private Skill skil;

	public Ranking() {
	}
	

	public Ranking(Integer ranking) {
		super();
		this.ranking = ranking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	
	
	

}
