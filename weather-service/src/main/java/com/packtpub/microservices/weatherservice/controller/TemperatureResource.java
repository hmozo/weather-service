package com.packtpub.microservices.weatherservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packtpub.microservices.weatherservice.domain.Temperature;
import com.packtpub.microservices.weatherservice.domain.TemperatureScale;

@RestController
@RequestMapping("/temperature")
public class TemperatureResource {
	
	@GetMapping
	public ResponseEntity<Temperature> getAverageTemperature(){
		Temperature temperature= new Temperature();
		temperature.setTemperature(35D);
		temperature.setTemperatureScale(TemperatureScale.CELSIUS);
		
		return ResponseEntity.status(HttpStatus.OK).body(temperature);
		//return ResponseEntity.ok(temperature);
	}

}
