package com.agrovetel.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String manufacturerName;

	@OneToMany(mappedBy = "manufacturer")
	private List<Ad> ads;

	public Manufacturer() {

	}

	public Manufacturer(String manufacturerName) {
		super();
		this.manufacturerName = manufacturerName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public List<Ad> getAds() {
		return ads;
	}

	public void setAds(List<Ad> ads) {
		this.ads = ads;
	}

	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", manufacturerName=" + manufacturerName + ", ads=" + ads + "]";
	}

}