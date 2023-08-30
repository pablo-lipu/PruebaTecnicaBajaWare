package com.bajaware.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class PersonaEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_persona", nullable = false)
	private Integer idPersona;

	private Integer genero;

	@Column(name = "edad_acreditado")
	private Integer edadEcreditado;

	@Column(name = "estado_civil")
	private Integer estadoCivil;

	@Column(name = "id_credito_h")
	private String idCreditoH;

	@Column(name = "monto_cred_aut")
	private Integer montoCredAut;

	private Integer montosubcuenta;

	@Column(name = "valor_vivienda_orig")
	private Integer valorViviendaOrig;

	@Column(name = "valor_avaluo")
	private Integer valor_avaluo;

	public PersonaEntity() {

	}

	public PersonaEntity(Integer idPersona, Integer genero, Integer edadEcreditado, Integer estadoCivil,
			String idCreditoH, Integer montoCredAut, Integer montosubcuenta, Integer valorViviendaOrig,
			Integer valor_avaluo) {

		this.idPersona = idPersona;
		this.genero = genero;
		this.edadEcreditado = edadEcreditado;
		this.estadoCivil = estadoCivil;
		this.idCreditoH = idCreditoH;
		this.montoCredAut = montoCredAut;
		this.montosubcuenta = montosubcuenta;
		this.valorViviendaOrig = valorViviendaOrig;
		this.valor_avaluo = valor_avaluo;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public Integer getEdadEcreditado() {
		return edadEcreditado;
	}

	public void setEdadEcreditado(Integer edadEcreditado) {
		this.edadEcreditado = edadEcreditado;
	}

	public Integer getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getIdCreditoH() {
		return idCreditoH;
	}

	public void setIdCreditoH(String idCreditoH) {
		this.idCreditoH = idCreditoH;
	}

	public Integer getMontoCredAut() {
		return montoCredAut;
	}

	public void setMontoCredAut(Integer montoCredAut) {
		this.montoCredAut = montoCredAut;
	}

	public Integer getMontosubcuenta() {
		return montosubcuenta;
	}

	public void setMontosubcuenta(Integer montosubcuenta) {
		this.montosubcuenta = montosubcuenta;
	}

	public Integer getValorViviendaOrig() {
		return valorViviendaOrig;
	}

	public void setValorViviendaOrig(Integer valorViviendaOrig) {
		this.valorViviendaOrig = valorViviendaOrig;
	}

	public Integer getValor_avaluo() {
		return valor_avaluo;
	}

	public void setValor_avaluo(Integer valor_avaluo) {
		this.valor_avaluo = valor_avaluo;
	}

	@Override
	public String toString() {
		return "PersonaEntity [idPersona=" + idPersona + ", genero=" + genero + ", edadEcreditado=" + edadEcreditado
				+ ", estadoCivil=" + estadoCivil + ", idCreditoH=" + idCreditoH + ", montoCredAut=" + montoCredAut
				+ ", montosubcuenta=" + montosubcuenta + ", valorViviendaOrig=" + valorViviendaOrig + ", valor_avaluo="
				+ valor_avaluo + "]";
	}

}
