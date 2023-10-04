package com.jsp.bookstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBook {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Book book = new Book();
		book.setName("The Hound of the Baskerville");
		book.setGenre("Mystery");
		book.setBooks_count(12);
		book.setPrice(200.0);
		
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();

	}

}
