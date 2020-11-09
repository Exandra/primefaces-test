package org.primefaces.test;

public class Car {

	public enum Brand {
		Acura,
		Alfa_Romeo,
		Audi,
		BMW,
		Bentley,
		Buick,
		Cadillac,
		Chevrolet,
		Chrysler,
		Dodge,
		Fiat,
		Ford,
		GMC,
		Genesis,
		Honda,
		Hyundai,
		Infiniti,
		Jaguar,
		Jeep,
		Kia,
		Land_Rover,
		Lexus,
		Lincoln,
		Lotus,
		Maserati,
		Mazda,
		Mercedes_Benz,
		Mercury,
		Mini,
		Mitsubishi,
		Nikola,
		Nissan,
		Polestar,
		Pontiac,
		Porsche,
		Ram,
		Rivian,
		Rolls_Royce,
		Saab,
		Saturn,
		Scion,
		Smart,
		Subaru,
		Suzuki,
		Tesla,
		Toyota,
		Volkswagen,
		Volvo
	}

	private Brand	brand;
	private int		constructionYear;
	private String	licensePlate;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
}
