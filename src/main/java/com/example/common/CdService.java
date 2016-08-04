package com.example.common;
import com.example.model.Cd;

/**
 * 
 * @author yandypiedra
 *
 */
public interface CdService {

	public Cd create(Cd cd);

	public Cd findCd(Long id);

}