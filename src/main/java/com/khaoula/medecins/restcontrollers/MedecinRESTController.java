package com.khaoula.medecins.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.khaoula.medecins.entities.Medecin;
import com.khaoula.medecins.service.MedecinService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MedecinRESTController {
	public class ProduitRESTController { 
		@Autowired
		MedecinService medecinService; 
		@RequestMapping(method = RequestMethod.GET) 
		public List<Medecin> getAllMedecins() { 
		return medecinService.getAllMedecins(); 
		}    
}}
