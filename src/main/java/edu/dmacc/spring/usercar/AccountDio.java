package edu.dmacc.spring.usercar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountDio {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SpringCars");
	
	public void addAccount(Account accountToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(accountToAdd);
		em.getTransaction().commit();
		em.close();
	}
}
