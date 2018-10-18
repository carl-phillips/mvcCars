package edu.dmacc.spring.usercar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarDaoInMemoryImpl implements CarDao {

	private Map<Long, Car> carsMap = new HashMap<Long, Car>();
	{
		Car car1 = new Car(1, "Chevy", "Tahoe", 2004, false);
		Car car2 = new Car(2, "Chevy", "Malibu", 2011, false);
		
		carsMap.put(car1.getId(), car1);
		carsMap.put(car2.getId(), car2);
	}
	
	public void insert(Car car) {
		carsMap.put(car.getId(), car);
	}
	
	public void update(Car car) {
		carsMap.put(car.getId(), car);
	}
	
	public void update(List<Car> cars) {
		for(Car car: cars) {
			update(car);
		}
	}
	
	public void delete(long carId) {
		carsMap.remove(carId);
	}
	
	public Car find(long carId) {
		return carsMap.get(carId);
	}
	
	public List<Car> find(List<Long> carIds) {
		List<Car> cars = new ArrayList<Car>();
		for(Long id: carIds) {
			cars.add(carsMap.get(id));
		}
		return cars;
	}
	
	public List<Car> find(String model){
		List<Car> cars = new ArrayList<Car>();
		for(Car car: carsMap.values()) {
			if(model.equals(car.getModel())) {
				cars.add(car);
			}
		}
		return cars;
	}
	
	public List<Car> find(int year){
		List<Car> cars = new ArrayList<Car>();
		for(Car car: carsMap.values()) {
			if(year == car.getYear()) {
				cars.add(car);
			}
		}
		return cars;
	}
	
	public List<Car> find(boolean sold){
		List<Car> cars = new ArrayList<Car>();
		for(Car car: carsMap.values()) {
			if(sold == car.isSold()) {
				cars.add(car);
			}
		}
		return cars;
	}

	public Map<Long, Car> getCarsMap() {
		return carsMap;
	}

	public void setCarsMap(Map<Long, Car> carsMap) {
		this.carsMap = carsMap;
	}

}
