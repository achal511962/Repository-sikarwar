package net.codejava.contact.dao;

import java.util.List;

import net.corejava.contact.model.Contact;

public interface ContactDAO {
   
	public int save(Contact contact);
   
	public int update(Contact contact);
	
	public Contact get(Object id);
	
	public int delete(Contact contact);
	
	public List<Contact> list();

	int delete(Integer id);
}
