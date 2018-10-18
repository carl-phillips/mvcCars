package edu.dmacc.spring.usercar;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CarDio {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SpringCars");
	
	public void insertCar(Car carToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(carToAdd);
		em.getTransaction().commit();
		em.close();
		emfactory.close();
	}

	public List<Car> getAllCars() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select c from Car c";
		TypedQuery<Car> typedQuery = em.createQuery(q, Car.class);
		List<Car> all = typedQuery.getResultList();
		return all;
	}
}
