package com.example.ejer2.model;




public class Ciudad {

	private String codCiudad;
	private String nomCiudad;
	
	public Ciudad(String codCiudad, String nomCiudad) {

		this.codCiudad = codCiudad;
		this.nomCiudad = nomCiudad;
	}

	public String getCodCiudad() {
		return codCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

}
