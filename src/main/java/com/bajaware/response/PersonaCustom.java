package com.bajaware.response;

/*ID_PERSONA
GENERO
EDAD_ACREDITADO
ESTADO_CIVIL*/
public class PersonaCustom {

	private Integer ID_PERSONA;
	private Integer genero;
	private Integer EDAD_ACREDITADO;
	private Integer ESTADO_CIVIL;

	public PersonaCustom() {

	}

	public PersonaCustom(Integer iD_PERSONA, Integer genero, Integer eDAD_ACREDITADO, Integer eSTADO_CIVIL) {

		ID_PERSONA = iD_PERSONA;
		this.genero = genero;
		EDAD_ACREDITADO = eDAD_ACREDITADO;
		ESTADO_CIVIL = eSTADO_CIVIL;
	}

	public Integer getID_PERSONA() {
		return ID_PERSONA;
	}

	public void setID_PERSONA(Integer iD_PERSONA) {
		ID_PERSONA = iD_PERSONA;
	}

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public Integer getEDAD_ACREDITADO() {
		return EDAD_ACREDITADO;
	}

	public void setEDAD_ACREDITADO(Integer eDAD_ACREDITADO) {
		EDAD_ACREDITADO = eDAD_ACREDITADO;
	}

	public Integer getESTADO_CIVIL() {
		return ESTADO_CIVIL;
	}

	public void setESTADO_CIVIL(Integer eSTADO_CIVIL) {
		ESTADO_CIVIL = eSTADO_CIVIL;
	}

	@Override
	public String toString() {
		return "PersonaCustom [ID_PERSONA=" + ID_PERSONA + ", genero=" + genero + ", EDAD_ACREDITADO=" + EDAD_ACREDITADO
				+ ", ESTADO_CIVIL=" + ESTADO_CIVIL + "]";
	}

}
