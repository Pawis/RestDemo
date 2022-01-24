package com.example.RestDemo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rezerwacje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Date okresNajmu;

	private int wynajmujaca_id;

	private int Najemca_id;

	private int koszt;
	
	public Rezerwacje() {
		
	}

	public Date getOkresNajmu() {
		return okresNajmu;
	}

	public void setOkresNajmu(Date okresNajmu) {
		this.okresNajmu = okresNajmu;
	}

	public int getWynajmujaca_id() {
		return wynajmujaca_id;
	}

	public void setWynajmujaca_id(int wynajmujaca_id) {
		this.wynajmujaca_id = wynajmujaca_id;
	}

	public int getNajemca_id() {
		return Najemca_id;
	}

	public void setNajemca_id(int najemca_id) {
		Najemca_id = najemca_id;
	}

	public int getKoszt() {
		return koszt;
	}

	public void setKoszt(int koszt) {
		this.koszt = koszt;
	}

	

}
