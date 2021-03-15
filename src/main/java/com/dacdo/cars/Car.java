package com.dacdo.cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
class Car {

	private @Id @GeneratedValue Long id;
	private String brand;
	private String model;
	private String price;

	// Car() {
	// }

	Car(String brand, String model, String price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setPrice(price);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
