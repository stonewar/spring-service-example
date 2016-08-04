package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.common.CdService;
import com.example.model.Cd;
import com.example.model.repository.CdRespository;

/**
 * 
 * @author yandypiedra
 *
 */
@Service
//@Qualifier("cdService")
@Transactional
public class CdServiceImpl implements CdService {

	@Autowired
	private CdRespository repo;
	
	/* (non-Javadoc)
	 * @see ch.example.service.CdService#create(ch.example.testmodel.model.Cd)
	 */
	public Cd create(Cd cd){
		Cd created = repo.save(cd);
		return findCd(created.getId());
	}
	
	/* (non-Javadoc)
	 * @see ch.example.service.CdService#findCd(java.lang.Long)
	 */
	public Cd findCd(Long id){
		return repo.findOne(id);
	}
}
