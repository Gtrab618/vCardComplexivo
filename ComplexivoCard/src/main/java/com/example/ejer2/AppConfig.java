package com.example.ejer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.ejer2.model.Ciudad;
import com.example.ejer2.model.Sucursal;

@Configuration
public class AppConfig {

	@Bean("itemsCiudad")
	public List<Ciudad> cargarCiudades(){
		
		
		Ciudad ciudad= new Ciudad("L001","Loja");
		Ciudad ciudad2= new Ciudad("Q002","Cuenca");
		Ciudad ciudad3= new Ciudad("G003","Guayaquil");
		
		return Arrays.asList(ciudad,ciudad2,ciudad3);
	}
	
	@Bean("itemsSucursal")
	public List<Sucursal> cargarSucursales(){

		Sucursal sucursal= new Sucursal("Tina01","Tinajillas");
		Sucursal sucursal2= new Sucursal("Ric02","Ricaurte");
		Sucursal sucursal3= new Sucursal("San03","Samborondon");
		sucursal.getCodSucursal();
		
		
		return Arrays.asList(sucursal,sucursal2,sucursal3);
	}
	
	
}
