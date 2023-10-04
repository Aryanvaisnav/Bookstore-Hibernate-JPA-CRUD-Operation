package com.jsp.bookstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBookById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Book book = entityManager.find(Book.class, 3);
		
		if(book != null) {
			entityTransaction.begin();
			entityManager.remove(book);
			entityTransaction.commit();
			System.out.println("Deleted");
			
		}
		else {
			System.out.println("Not Deleted");
			
		}
		
		
	}

}
