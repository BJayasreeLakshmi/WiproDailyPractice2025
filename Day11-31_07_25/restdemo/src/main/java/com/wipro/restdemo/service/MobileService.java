package com.wipro.restdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restdemo.entity.DtoMobile;
import com.wipro.restdemo.repository.MobileRepository;

@Service
public class MobileService {
	
	@Autowired
	MobileRepository repo;
	
	public void save(DtoMobile mobile) {
        repo.save(mobile);
    }
	
	public List<DtoMobile> getAll() {
        return repo.findAll();
    }
	
	public DtoMobile getById(int id) {
        return repo.findById(id);
    }
	
	public boolean update(DtoMobile mobile) {
        return repo.update(mobile);
    }
	
	public boolean delete(int id) {
        return repo.delete(id);
    }

}
