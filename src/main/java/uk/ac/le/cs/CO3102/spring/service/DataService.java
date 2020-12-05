package uk.ac.le.cs.CO3102.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.le.cs.CO3102.spring.repository.DataRepository;

@Service
public class DataService {
	
	@Autowired
	private DataRepository adminRepository;
	
	public Object findAllCases(){
		return adminRepository.findAll();
	}
	
	public Object findByName(String country){
		return adminRepository.findByName(country);
	}
	

}
