package net.codejava.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.corejava.contact.model.Contact;

class ContactDAOTest {
    private DriverManagerDataSource dataSource;
	private ContactDAO dao; 
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger10");
		
		dao = new ContactDAOImpl (dataSource);
		
	}
 
	@Test
	void testSave() {
		Contact contact = new Contact(100,"Singh","Test1@gmail.com","Pune","9921000477");
		int result = dao.save(contact);
		
		assertTrue(result>0);
		fail("Not yet implemented 11");
	}

	@Test
	void testUpdate() { 
		Contact contact = new Contact(100,"Singh","Testing123@gmail.com","Pune","9921000477");
		int result = dao.update(contact);
		
		assertTrue(result>0);
		fail("Not yet implemented 22");
	}

	@Test
	void testGet() {
		Integer id = 100;
		Contact contact = dao.get(id);
		
		if (contact != null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
		fail("Not yet implemented 33");
	}

	@Test
	void testDelete() {
		Integer id = 200;
		int result = dao.delete(id);
		
		assertTrue(result>0);
		fail("Not yet implemented 44");
	}

	@Test
	void testList() {
		List<Contact> listContact = dao.list();
		   for(Contact aContact : listContact) {
			 System.out.println(aContact);  
		   }
		assertTrue(!listContact.isEmpty());
		fail("Not yet implemented"); 
	}

}
