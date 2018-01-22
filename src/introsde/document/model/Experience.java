package introsde.document.model;

//import introsde.document.dao.*;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

public class Experience implements Serializable {
	
	private String duration;
	private String distance;
	private Double max_temperature;
	private Double min_temperature;
	private String precipitations;

	public Experience(String duration, String distance) {
		this.duration = duration;
		this.distance = distance;
	}

	public Experience() {

	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getDistance() {
		return this.distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Double getMax_temperature() {
		return max_temperature;
	}

	public void setMax_temperature(Double max_temperature) {
		this.max_temperature = max_temperature;
	}

	public Double getMin_temperature() {
		return min_temperature;
	}

	public void setMin_temperature(Double min_temperature) {
		this.min_temperature = min_temperature;
	}

	public String getPrecipitations() {
		return precipitations;
	}

	public void setPrecipitations(String precipitations) {
		this.precipitations = precipitations;
	}

}