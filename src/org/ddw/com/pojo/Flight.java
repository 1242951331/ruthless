package org.ddw.com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int flightID;
		@ManyToOne
		private City startCityID;
		@ManyToOne
		private City endCityID;
		
		private String startTime;

		@Override
		public String toString() {
			return "Flight [flightID=" + flightID + ", startCityID=" + startCityID + ", endCityID=" + endCityID
					+ ", tartTime=" + startTime + "]";
		}

	

		public Flight(int flightID, City startCityID, City endCityID, String tartTime) {
			super();
			this.flightID = flightID;
			this.startCityID = startCityID;
			this.endCityID = endCityID;
			this.startTime = tartTime;
		}



		public int getFlightID() {
			return flightID;
		}

		public void setFlightID(int flightID) {
			this.flightID = flightID;
		}



		public City getStartCityID() {
			return startCityID;
		}

		public void setStartCityID(City startCityID) {
			this.startCityID = startCityID;
		}

		public City getEndCityID() {
			return endCityID;
		}

		public void setEndCityID(City endCityID) {
			this.endCityID = endCityID;
		}

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String tartTime) {
			this.startTime = tartTime;
		}

		public Flight() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
