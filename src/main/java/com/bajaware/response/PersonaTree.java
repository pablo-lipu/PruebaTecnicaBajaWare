package com.bajaware.response;


public class PersonaTree {

	private Integer estadoCivil;
	private Long montoSubcuenta;

	public PersonaTree() {

	}


	public PersonaTree(Integer estadoCivil, Long montoSubcuenta) {

		this.estadoCivil = estadoCivil;
		this.montoSubcuenta = montoSubcuenta;
	}


	public Integer getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public Long getMontoSubcuenta() {
		return montoSubcuenta;
	}


	public void setMontoSubcuenta(Long montoSubcuenta) {
		this.montoSubcuenta = montoSubcuenta;
	}


	@Override
	public String toString() {
		return "PersonaTree [estadoCivil=" + estadoCivil + ", montoSubcuenta=" + montoSubcuenta + "]";
	}

}
