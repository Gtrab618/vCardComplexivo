package com.example.ejer2.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;




@Component
public class Empleado {
	@Value("${empleado.imgUrl}")
	private String imgUrl;
	@Value("${empleado.nomEmpleado}")
	private String nomEmpleado;
	
	@Value("${empleado.imgUrl2}")
	private String imgUrl2;
	@Value("${empleado.nomEmpleado2}")
	private String nomEmpleado2;

	@Value("${empleado.imgUrl3}")
	private String imgUrl3;
	@Value("${empleado.nomEmpleado3}")
	private String nomEmpleado3;
	
	@Autowired
	private List<Ciudad> ciudad;
	@Autowired
	private List<Sucursal> sucursal;
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getNomEmpleado() {
		return nomEmpleado;
	}
	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}
	public List<Ciudad> getCiudad() {
		return ciudad;
	}
	public void setCiudad(List<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}
	public List<Sucursal> getSucursal() {
		return sucursal;
	}
	public void setSucursal(List<Sucursal> sucursal) {
		this.sucursal = sucursal;
	}
	public String getImgUrl2() {
		return imgUrl2;
	}
	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}
	public String getNomEmpleado2() {
		return nomEmpleado2;
	}
	public void setNomEmpleado2(String nomEmpleado2) {
		this.nomEmpleado2 = nomEmpleado2;
	}
	public String getImgUrl3() {
		return imgUrl3;
	}
	public void setImgUrl3(String imgUrl3) {
		this.imgUrl3 = imgUrl3;
	}
	public String getNomEmpleado3() {
		return nomEmpleado3;
	}
	public void setNomEmpleado3(String nomEmpleado3) {
		this.nomEmpleado3 = nomEmpleado3;
	}

	
	
}
