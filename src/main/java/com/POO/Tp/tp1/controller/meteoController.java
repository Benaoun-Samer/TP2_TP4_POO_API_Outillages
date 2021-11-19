package com.POO.Tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.POO.Tp.tp1.model.Address;
import com.POO.Tp.tp1.model.jsonAdress;
import com.POO.Tp.tp1.model.response;

import net.bytebuddy.asm.Advice.This;

@Controller
public class meteoController {
	Address adresse  ;
	@Autowired
	
	 @GetMapping("/meteo")
    public String getmeteo() {
    	return "meteo";
    }
	@PostMapping("/meteo")
	public String addressSubmit(@ModelAttribute Address adress,Model model) {
		model.addAttribute("adress",adress);
		this.adresse=adress;
		System.out.println(this.adresse.getContent());
		
		RestTemplate restTemplate=new RestTemplate();
		jsonAdress jsAdrs=restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adresse.getContent(), jsonAdress.class);
		System.err.println(jsAdrs.features[0].geometry);
		System.out.println(jsAdrs.features[0].geometry.coordinates[1]);
		response rep=restTemplate.getForObject("https://api.meteo-concept.com/api/forecast/daily?token=68b8d2d0ce708d7c6123c61668121e6a3240"
			                         	+ "c04e12afa1c241c1e5cee0f5d4fe&latlng="+jsAdrs.features[0].geometry.coordinates[1]+","+jsAdrs.features[0].geometry.coordinates[0],response.class);
		model.addAttribute("response", rep);
		System.out.println(rep);
		
		return "meteo";
	}
	
}
