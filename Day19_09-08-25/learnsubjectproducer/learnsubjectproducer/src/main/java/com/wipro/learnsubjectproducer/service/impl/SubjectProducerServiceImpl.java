package com.wipro.learnsubjectproducer.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.learnsubjectproducer.service.SubjectProducerService;
import com.wipro.learnsubjectproducer.subject.Subject;


@Service
public class SubjectProducerServiceImpl implements SubjectProducerService{
	@Autowired
//	KafkaTemplate<String,String> kafkaTemplate;
	KafkaTemplate<String,Subject> kafkaTemplate;

//	@Override
//	public void sendSubjectData(String subjectCode, String subjectMessage) {
//		kafkaTemplate.send("learn-subject",subjectMessage);
//		
//	}
	
	@Override
	public void sendSubjectData(Subject subject) {
		kafkaTemplate.send("learn-subject",subject);
		
	}
	
}