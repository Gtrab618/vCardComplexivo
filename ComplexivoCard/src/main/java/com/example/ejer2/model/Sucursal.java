package com.example.ejer2.model;




public class Sucursal {
	private	String codSucursal;
	private String nomSucursal;

	public Sucursal(String codSucursal, String nomSucursal) {

		this.codSucursal = codSucursal;
		this.nomSucursal = nomSucursal;
	}

	public String getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(String codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getNomSucursal() {
		return nomSucursal;
	}

	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}
	
	
}
