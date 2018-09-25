package nab.nabone.npsapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TechnicalServices")
public class TechnicalService {

	@Id
	private String name;
	
	private List<Month> months;
	
	public TechnicalService(String name) {
		super();
		this.name = name;
	}
	
	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	public String toString() {
		return "name: " + name;
	}
	
}
