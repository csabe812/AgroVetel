package com.agrovetel.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "ads")
public class Ad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column()
	private String title;
	@Column()
	@Min(value = 0)
	private double price;
	@Column()
	private String description;
	@Column
	private LocalDateTime timeStamp;
	/* if this value is true, it means sell, if this value false, it means search */
	@Column
	private boolean sellOrSearch;
	@Column
	private int horsePower;
	@Column
	private int yearOfManufact;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	public Ad() {

	}

	public Ad(String title, @Min(0) double price, LocalDateTime timeStamp, boolean sellOrSearch, User user) {
		super();
		this.title = title;
		this.price = price;
		this.timeStamp = timeStamp;
		this.sellOrSearch = sellOrSearch;
		this.user = user;
	}

	public Ad(String title, @Min(0) double price, String description, LocalDateTime timeStamp, boolean sellOrSearch,
			int horsePower, int yearOfManufact, Category category, Manufacturer manufacturer, User user) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
		this.timeStamp = timeStamp;
		this.sellOrSearch = sellOrSearch;
		this.horsePower = horsePower;
		this.yearOfManufact = yearOfManufact;
		this.category = category;
		this.manufacturer = manufacturer;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isSellOrSearch() {
		return sellOrSearch;
	}

	public void setSellOrSearch(boolean sellOrSearch) {
		this.sellOrSearch = sellOrSearch;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYearOfManufact() {
		return yearOfManufact;
	}

	public void setYearOfManufact(int yearOfManufact) {
		this.yearOfManufact = yearOfManufact;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Ad [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", timeStamp=" + timeStamp + ", sellOrSearch=" + sellOrSearch + ", horsePower=" + horsePower
				+ ", yearOfManufact=" + yearOfManufact + ", category=" + category + ", manufacturer=" + manufacturer
				+ ", user=" + user + "]";
	}

}
