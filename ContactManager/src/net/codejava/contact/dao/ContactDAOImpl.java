package net.codejava.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import net.corejava.contact.model.Contact;

public class ContactDAOImpl implements ContactDAO {

	private static final String ResultSetExractor = null;
	private JdbcTemplate jdbcTemplate;
	
	public ContactDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Contact c) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO contact(id, name, email, adress, phone) VALUES(?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql, c.getId(), c.getName(), c.getEmail(), c.getAddress(), c.getPhone()); 
		
	}

	@Override
	public int update(Contact c) {
		String sql = "update contact set name=?, email=?, address=?, phone=? where contact_id=?";
		return jdbcTemplate.update(sql, c.getName(), c.getEmail(), c.getAddress(),c.getPhone());
	}

	@Override
	public Contact get(int id) {
		String sql = "SELECT * FROM contact WHERE contact_id=" +id;
		
		ResultSetExtractor<Contact> extractor = new ResultSetExtractor<Contact>() {
		
		@Override 
		public Contact extractData(ResultSet rs) throws DataAccessException, SQLException{
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String phone = rs.getString("phone"); 
				
				return new Contact(id, name, email, address, phone);
			}   
		 	return null;
		}
	};    
	return jdbcTemplate.query(sql, extractor);
	}
    		
	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM contact WHERE contact_id=" +id;
		return jdbcTemplate.update(sql);
	   }
	
	
	@Override
	public List<Contact> list() {
		String sql = "SELECT * FRON contact";
		
		RowMapper<Contact> rowMapper = new RowMapper<Contact>() {
		
			@Override 
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException{
					Integer id = rs.getInt("contact_id");
				    String name = rs.getString("name");
					String email = rs.getString("email");
					String address = rs.getString("address");
					String phone = rs.getString("phone"); 
					
					return new Contact(id, name, email, address, phone);  			
		     }
	 };	
		  jdbcTemplate.query(sql, rowMapper);
		return null;
	}

	@Override
	public int delete(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}
}	


