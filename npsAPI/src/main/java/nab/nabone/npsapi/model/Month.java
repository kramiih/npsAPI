package nab.nabone.npsapi.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Month {

	@Id
	private Date date;
	
	private List<Survey> surveys;
	
	private Summary summary;
	
	public List<Survey> getSurveys() {
		return surveys;
	}

	public void setSurveys(List<Survey> surveys) {
		this.surveys = surveys;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	
	public String toString() {
		return "survey count: " + surveys.size() + " for month: " + date.toString();
	}
}
