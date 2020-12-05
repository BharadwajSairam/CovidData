package uk.ac.le.cs.CO3102.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.le.cs.CO3102.spring.domain.Data;

@Repository
public interface DataRepository extends CrudRepository<Data,String> {

	Data findByName(String country);

	}
