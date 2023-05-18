package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pallavi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Person person=new Person();
	person.setName("pallu");
	person.setEmail("pallu@mail.com");
	
	Pan pan=new Pan();
	pan.setGst_number("pallu1234");
	pan.setPerson(person);
	person.setPan(pan);
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pan);
	entityTransaction.commit();
	
	
	
	
	
	
}
	

}
