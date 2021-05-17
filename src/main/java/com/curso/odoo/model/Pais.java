package com.curso.odoo.model;

public class Pais {

	//Asociado a tabla Paises
	private int codigopais;
	private String nombrepais;
	
	
	public int getCodigopais() {
		return codigopais;
	}
	public void setCodigopais(int codigopais) {
		this.codigopais = codigopais;
	}
	public String getNombrepais() {
		return nombrepais;
	}
	public void setNombrepais(String nombrepais) {
		this.nombrepais = nombrepais.toUpperCase();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El coigo del pais es:"+getCodigopais()+ " y el nombre es:"+ getNombrepais();
	}
	
	
	
	
}
