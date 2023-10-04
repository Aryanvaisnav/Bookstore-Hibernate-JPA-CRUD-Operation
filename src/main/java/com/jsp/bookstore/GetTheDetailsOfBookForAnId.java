package com.jsp.bookstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetTheDetailsOfBookForAnId {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Book book = entityManager.find(Book.class, 1);
		
		System.out.println(book.getName());
		System.out.println(book.getGenre());
		System.out.println(book.getBooks_count());
		System.out.println(book.getPrice());
		System.out.println("===============================================================================================================");
	}

}
