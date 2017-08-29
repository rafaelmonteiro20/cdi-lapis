package com.lapis.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

	private EntityManagerFactory emf;
	
	public EntityManagerProducer() {
		emf = Persistence.createEntityManagerFactory("lapis-pu");
	}
	
	@Produces
	@RequestScoped
	public EntityManager create() {
		return emf.createEntityManager();
	}
	
	public void close(@Disposes EntityManager manager) {
		manager.close();
	}
	
}