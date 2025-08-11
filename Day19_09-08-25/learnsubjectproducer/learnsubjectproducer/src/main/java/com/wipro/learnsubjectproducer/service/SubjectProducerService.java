package com.wipro.learnsubjectproducer.service;

import com.wipro.learnsubjectproducer.subject.Subject;

public interface SubjectProducerService {
//	void sendSubjectData(String subjectCode,String subjectMessage);
	
	void sendSubjectData(Subject subject);
}