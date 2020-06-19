package com.niu2020.Models.Service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio {
	// llamaremos este metodo para inyectarlo
public String operacion() {
	return"esta operacion es importante";
}
}
