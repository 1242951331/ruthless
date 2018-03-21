package org.ddw.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.ddw.com.pojo.City;
import org.ddw.com.pojo.Flight;
import org.ddw.com.service.CityService;
import org.ddw.com.service.FilghtService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {
		@Resource
		private FilghtService fs;
		@Resource
		private CityService cs;
		
		@RequestMapping(value="/list")
		public String fn1(ModelMap map,Flight ft) {
			System.out.println(">>"+ft);
			String sql = "select * from flight where 1=1";
			if (ft!=null&&ft.getStartCityID()!=null) {
				sql+=" and startCityID = "+ft.getStartCityID()+" and endCityID = "+ft.getEndCityID()+"";
			}
			
			List<Flight> fsall = fs.selectAll(sql);
			List<City> cslist = cs.selectAll();
			map.put("fsall",fsall);
			map.put("cslist",cslist);
			System.out.println(fsall);
			return "showtable";
		}
}
