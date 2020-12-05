package uk.ac.le.cs.CO3102.spring.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Data {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhoregion() {
		return whoregion;
	}

	public void setWhoregion(String whoregion) {
		this.whoregion = whoregion;
	}

	public Float getTotalcases() {
		return totalcases;
	}

	public void setTotalcases(Float totalcases) {
		this.totalcases = totalcases;
	}

	public Float getCasespermillion() {
		return casespermillion;
	}

	public void setCasespermillion(Float casespermillion) {
		this.casespermillion = casespermillion;
	}

	public Float getLastsevendaycases() {
		return lastsevendaycases;
	}

	public void setLastsevendaycases(Float lastsevendaycases) {
		this.lastsevendaycases = lastsevendaycases;
	}

	public Float getLast24hrcases() {
		return last24hrcases;
	}

	public void setLast24hrcases(Float last24hrcases) {
		this.last24hrcases = last24hrcases;
	}

	public Float getTotaldeaths() {
		return totaldeaths;
	}

	public void setTotaldeaths(Float totaldeaths) {
		this.totaldeaths = totaldeaths;
	}

	public Float getDeathspermillion() {
		return deathspermillion;
	}

	public void setDeathspermillion(Float deathspermillion) {
		this.deathspermillion = deathspermillion;
	}

	public Float getLastsevendaydeaths() {
		return lastsevendaydeaths;
	}

	public void setLastsevendaydeaths(Float lastsevendaydeaths) {
		this.lastsevendaydeaths = lastsevendaydeaths;
	}

	public Float getLast24hrsdeaths() {
		return last24hrsdeaths;
	}

	public void setLast24hrsdeaths(Float last24hrsdeaths) {
		this.last24hrsdeaths = last24hrsdeaths;
	}

	public String getTransmissionclassifications() {
		return transmissionclassifications;
	}

	public void setTransmissionclassifications(String transmissionclassifications) {
		transmissionclassifications = transmissionclassifications;
	}

	@Id
    @Column(name = "Id")
    Integer id;

	
	@Column(name = "Name")
    String name;
	
	@Column(name = "Whoregion")
    String whoregion;
	
	@Column(name = "Totalcases")
    Float totalcases;
	
	@Column(name = "casespermillion")
	Float casespermillion;
	
	@Column(name = "lastsevendaycases")
	Float lastsevendaycases;
	
	@Column(name = "last24hrcases")
	Float last24hrcases;
	
	@Column(name = "totaldeaths")
	Float totaldeaths;
	
	@Column(name = "deathspermillion")
	Float deathspermillion;
	
	@Column(name = "lastsevendaydeaths")
	Float lastsevendaydeaths;
	
	@Column(name = "last24hrsdeaths")
	Float last24hrsdeaths;
	
	@Column(name = "Transmissionclassifications")
	String transmissionclassifications;
	
	
	        
}
