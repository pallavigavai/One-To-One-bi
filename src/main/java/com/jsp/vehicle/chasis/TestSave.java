package com.jsp.vehicle.chasis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pallavi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setBrand("Mahindra");
		vehicle.setName("xuv");
		vehicle.setColor("red");
		vehicle.setPrice(700000);
		
		Chasis chasis=new Chasis();
		chasis.setChasis_no("12345");
		vehicle.setChasis(chasis);
		chasis.setVehicle(vehicle);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chasis);
		entityTransaction.commit();
		
		
	
		
	
		
		

}
