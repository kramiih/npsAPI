package nab.nabone.npsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nab.nabone.npsapi.model.Month;
import nab.nabone.npsapi.model.Summary;
import nab.nabone.npsapi.model.Survey;
import nab.nabone.npsapi.repository.MonthRepository;

@Service
public class NpsCalculationService {

	@Autowired
	private MonthRepository monthRepository;
	
	
	public Month caculateNpsScore(Month month) {
	/*	//number of promoters - number of detractors / number of respondents X 100
		int promoters = 0;
		int detractors = 0;
		
		
		for(Survey survey : month.getSurveys()) {
			if(survey.getScore() < 7) {
				detractors++;
			} else if(survey.getScore() > 8) {
				promoters++;
			}
		}
		
		if(detractors == 0) {
			detractors = 1;
		}
		
		float score = (promoters/detractors)/month.getSurveys().size() * 100;
		
		month.setSummary(new Summary(score));
		
		return monthRepository.save(month);*/
		return null;
	}
}
