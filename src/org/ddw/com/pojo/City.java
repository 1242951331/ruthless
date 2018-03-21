package org.ddw.com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int cityID;
		
		private String cityName;

		public City(int cityID, String cityName) {
			super();
			this.cityID = cityID;
			this.cityName = cityName;
		}

		public int getCityID() {
			return cityID;
		}

		public void setCityID(int cityID) {
			this.cityID = cityID;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		@Override
		public String toString() {
			return "City [cityID=" + cityID + ", cityName=" + cityName + "]";
		}

		public City() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
}
