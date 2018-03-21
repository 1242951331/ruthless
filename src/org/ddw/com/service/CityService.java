package org.ddw.com.service;

import java.util.List;

import javax.annotation.Resource;

import org.ddw.com.dao.CityDao;
import org.ddw.com.pojo.City;
import org.springframework.stereotype.Service;

@Service
public class CityService {
		
		@Resource
		private CityDao cd;
		
		public List<City> selectAll() {
			return cd.selectAll();
		}
		
}
