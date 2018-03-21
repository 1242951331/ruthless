package org.ddw.com.dao;

import java.util.List;

import javax.annotation.Resource;

import org.ddw.com.pojo.City;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
////// hello
public class CityDao {

	@Resource
	private SessionFactory sf;

	public List<City> selectAll() {
		Session session = sf.getCurrentSession();
		String sql = "select * from city";
		SQLQuery query = session.createSQLQuery(sql).addEntity(City.class);
		List list = query.list();
		return list;

	}

}
