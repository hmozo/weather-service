package com.packtpub.microservices.weatherservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Temperature {

	private Double temperature;
	private TemperatureScale temperatureScale;
}
