package com.wipro.restdemo.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.restdemo.entity.DtoMobile;

@Repository
public class MobileRepository {
	
	List<DtoMobile> list=new ArrayList<>();
	
	public void save(DtoMobile mobile) {
		list.add(mobile);
	}

	public List<DtoMobile> findAll(){
		
		return list;
		
	}
	public DtoMobile findById(int id){
		
		for(DtoMobile m:list) {
			if(m.getId()==id)
			{
				return m;
			}
		}
		
		return null;
		
	}
	public boolean update(DtoMobile updatedMobile) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == updatedMobile.getId()) {
                list.set(i, updatedMobile);
                return true;
            }
        }
        return false;
    }
	public boolean delete(int id) {
        Iterator<DtoMobile> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
