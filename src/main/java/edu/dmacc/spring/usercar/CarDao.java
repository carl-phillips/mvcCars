package edu.dmacc.spring.usercar;

import java.util.List;

public interface CarDao {
	
	public void insert(Car car);
	public void update(Car car);
	public void update(List<Car> cars);
	public void delete(long carId);
	public Car find(long carId);
	public List<Car> find(List<Long> carIds);
	public List<Car> find(String model);
	public List<Car> find(int year);
	public List<Car> find(boolean sold);
}
