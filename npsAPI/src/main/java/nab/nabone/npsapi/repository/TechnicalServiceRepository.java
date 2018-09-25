package nab.nabone.npsapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import nab.nabone.npsapi.model.TechnicalService;

@Repository
public interface TechnicalServiceRepository extends MongoRepository<TechnicalService, String>{

	
	public TechnicalService findByName(String name);
}
