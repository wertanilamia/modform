package org.sid.web;

import java.util.List;

import org.sid.dao.bilanRepository;
import org.sid.entities.Bilan;
import org.sid.entities.FicheBesoins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class BilanController {
@Autowired
private bilanRepository bilanRepository;

@RequestMapping(value = "/bilan",method = RequestMethod.GET)
public List<FicheBesoins> getallBilan(){
	return bilanRepository.getBilan();
		
}
}
