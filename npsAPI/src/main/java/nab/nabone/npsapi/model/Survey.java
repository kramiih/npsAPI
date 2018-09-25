package nab.nabone.npsapi.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="surveys")
public class Survey {

	@Id
	private String id;
	
	private Date date;
	private String verbatim;
	private int score;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getVerbatim() {
		return verbatim;
	}

	public void setVerbatim(String verbatim) {
		this.verbatim = verbatim;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "Survey with id: " + id + " date: " + date;
	}
	
	
}
