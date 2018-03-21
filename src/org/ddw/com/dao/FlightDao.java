package org.ddw.com.dao;

import java.util.List;

import javax.annotation.Resource;

import org.ddw.com.pojo.Flight;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class FlightDao {
	@Resource
	private SessionFactory sf;
	
	
	public List<Flight> select(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery query = session.createSQLQuery(sql).addEntity(Flight.class);
		List list = query.list();
		
		return list;
			
	}
	
	
	
}
