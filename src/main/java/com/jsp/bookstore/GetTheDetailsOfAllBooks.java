package com.jsp.bookstore;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetTheDetailsOfAllBooks {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "Select b from Book b";
		Query query = entityManager.createQuery(sql);
		
		List<Book> books = query.getResultList();
		
		for(Book b : books) {
			System.out.println(b.getName());
			System.out.println(b.getGenre());
			System.out.println(b.getBooks_count());
			System.out.println(b.getPrice());
			System.out.println("================================================================================================================");
			
		}

	}

}
