package com.example.common;
import java.util.Iterator;
import com.example.model.Cd;

/**
 * 
 * @author yandypiedra
 *
 */
public interface CdService {

	public Cd create(Cd cd);

	public Cd findCd(Long id);
	
	public Iterator<Cd> findAll();

}