package nab.nabone.npsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nab.nabone.npsapi.model.Survey;
import nab.nabone.npsapi.model.TechnicalService;
import nab.nabone.npsapi.repository.SurveyRepository;
import nab.nabone.npsapi.repository.TechnicalServiceRepository;

@Service
public class TechnicalServiceService {
	
	@Autowired
	private TechnicalServiceRepository technicalServiceRepository;
	
	public void updateSurveyToTechnicalService(Survey survey) {
		
	}
	
	public TechnicalService getByName(String name) {
		return technicalServiceRepository.findByName(name);
	}
	
	public List<TechnicalService> getAll() {
		return technicalServiceRepository.findAll();
	}
	
	public TechnicalService create(String name) {
		return technicalServiceRepository.save(new TechnicalService(name));
	}
	
	public void delete(String name) {
		technicalServiceRepository.delete(technicalServiceRepository.findByName(name));
	}
	
}
