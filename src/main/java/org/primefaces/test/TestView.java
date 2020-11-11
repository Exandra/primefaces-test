package org.primefaces.test;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

@Named
@ViewScoped
public class TestView implements Serializable {

	private static final long serialVersionUID = 4124891683211838799L;

	private List<Car> cars;

	@PostConstruct
	public void init() {
		Random random = new Random();
		cars = new LinkedList<>();
		for (int i = 0; i < 150; i++) {
			Car car = new Car();
			car.setBrand(Car.Brand.values()[random.nextInt(Car.Brand.values().length)]);
			car.setConstructionYear(1950 + random.nextInt(70));
			car.setLicensePlate(UUID.randomUUID().toString().substring(0, 6));
			cars.add(car);
		}
	}
	
	public void sleep() {
		try {
			System.out.println("Sleep called");
			Thread.sleep(2000);
		} catch (Exception e) {
		}			
	}

	public void doOpenDialog(Car car) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, car.getBrand().toString(), car.getLicensePlate());
		PrimeFaces.current().dialog().showMessageDynamic(facesMessage);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
