package edu.dmacc.spring.usercar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	@Autowired CarDio dio;
	
	@RequestMapping(value = "/form")
		public ModelAndView car() {
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("carForm");
			modelAndView.addObject("car", new Car());
			return modelAndView;
	}
		
	@RequestMapping(value= "result")
		public ModelAndView processCar(Car car) {
			System.out.println("In processCar");
			ModelAndView modelAndView = new ModelAndView();
			dio.insertCar(car);
			System.out.println("Value in getCar" + car.getClass());
			modelAndView.setViewName("carResult");
			modelAndView.addObject("c", car);
			return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
		public ModelAndView viewAll() {
			ModelAndView modelAndView = new ModelAndView();
			List<Car> allCars = dio.getAllCars();
			modelAndView.setViewName("viewAllCars");;
			modelAndView.addObject("all", allCars);
			return modelAndView;
	}
	
	@Bean
		public CarDio dio() {
		CarDio bean = new CarDio();
		return bean;
	}
}
