package nab.nabone.npsapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Summary {

	public Summary(float npsScore) {
		super();
		this.npsScore = npsScore;
	}

	private float npsScore;
	
	
	
	public float getNpsScore() {
		return npsScore;
	}

	public void setNpsScore(float npsScore) {
		this.npsScore = npsScore;
	}

	public String toString() {
		return "npsScore: " + npsScore;
	}
}
