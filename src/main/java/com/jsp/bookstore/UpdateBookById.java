package com.jsp.bookstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBookById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Book book = entityManager.find(Book.class, 2);
		book.setBooks_count(20);
		book.setPrice(250);
		
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		
		

	}

}
