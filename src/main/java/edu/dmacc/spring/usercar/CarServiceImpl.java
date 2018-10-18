package edu.dmacc.spring.usercar;

public class CarServiceImpl implements CarService{
	
	private CarDao carDao;
	
	public CarServiceImpl() {
		
	}
	
	public CarServiceImpl(CarDao carDao) {
		this.carDao = carDao;
	}
	
	public CarDao getCarDao() {
		return carDao;
	}
	
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
	
	public void sellCar(long carId, boolean sold) {
		Car buyCarId = carDao.find(carId);
		buyCarId.setSold(true);
		carDao.update(buyCarId);
	}
	
	public Car getCar(long carId) {
		return carDao.find(carId);
	}

}
