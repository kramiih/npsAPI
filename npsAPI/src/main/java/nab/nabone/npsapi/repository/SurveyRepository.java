package nab.nabone.npsapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import nab.nabone.npsapi.model.Survey;

@Repository
public interface SurveyRepository extends MongoRepository<Survey, String>{

	public List<Survey> findByScore(int score);
	public List<Survey> findAllByDates(Date from, Date to);
}
 