package org.primefaces.test;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

	private static final long serialVersionUID = 7153990443955836341L;

	public static class Car {

		private String	brand;
		private String	model;
		private String	price;
		private String	c02;
		private String	category;
		private String	categoryDescription;
		private String	description;

		public Car() {

		}

		public Car(String brand, String model, String price, String c02, String category, String categoryDescription, String description) {
			this.brand = brand;
			this.model = model;
			this.price = price;
			this.c02 = c02;
			this.category = category;
			this.categoryDescription = categoryDescription;
			this.description = description;
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

		public String getC02() {
			return c02;
		}

		public void setC02(String c02) {
			this.c02 = c02;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCategoryDescription() {
			return categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	private List<Car> cars = new LinkedList<>();

	@PostConstruct
	public void init() {
		String blindtext = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
		String categoryDescription = "Sport utility vehicle (SUV) is a category of motor vehicles that combine elements of road-going passenger cars with features from off-road vehicles, such as raised ground clearance and four-wheel drive. ";
		cars.add(new Car("Mazda", "CX-3", "18.490 €", "114 g/km", "SUV", categoryDescription, blindtext));
		cars.add(new Car("Peugeot", "3008", "25.400 €", "112 g/km", "SUV", categoryDescription, blindtext));
		cars.add(new Car("BMW", "X3", "46.300 €", "187 g/km", "SUV", categoryDescription, blindtext));
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
