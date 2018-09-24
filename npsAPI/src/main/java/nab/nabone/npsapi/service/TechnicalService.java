package nab.nabone.npsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nab.nabone.npsapi.model.Survey;
import nab.nabone.npsapi.repository.SurveyRepository;

@Service
public class TechnicalService {
	
	@Autowired
	private SurveyRepository surveyRepository;
	
	
	public void updateSurveyToTechnicalService(Survey survey) {
		
	}
}
