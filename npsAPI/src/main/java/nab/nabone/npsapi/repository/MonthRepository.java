package nab.nabone.npsapi.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import nab.nabone.npsapi.model.Month;

@Repository
public interface MonthRepository extends MongoRepository<Month, Date>{

}
