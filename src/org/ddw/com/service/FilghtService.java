package org.ddw.com.service;

import java.util.List;

import javax.annotation.Resource;

import org.ddw.com.dao.FlightDao;
import org.ddw.com.pojo.Flight;
import org.springframework.stereotype.Service;

@Service
public class FilghtService {
	@Resource
	private FlightDao  fd;
	
	public List<Flight> selectAll(String sql) {
		return fd.select(sql);
	}
		
}
