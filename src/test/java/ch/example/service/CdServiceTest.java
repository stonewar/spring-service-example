package ch.example.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.common.CdService;
import com.example.config.ServiceConfig;
import com.example.model.Cd;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ServiceConfig.class)
public class CdServiceTest {

	@Autowired
	//@Qualifier("cdService")
	private CdService cdService; 
	
	@Test
	@Before
	public void testIsInitilized() {
		assertNotNull(cdService);
		Cd cd = new Cd();
		cd.setName("The power of Spring");
		Cd created = cdService.create(cd);
		assertEquals(cd.getName(), created.getName());
		assertEquals(cd, created);
		assertNotSame(cd, created);
	}
	
	
	@Test
	public void testfindAll(){
		//Update this test
		boolean found = false;
		for(Iterator<Cd> it = cdService.findAll(); it.hasNext();){
			found = true;
			break;
		}
		assertTrue(found);
	}
	
	
}
