package com.bajaware.response;

/*ID_CREDITO_H
MONTO_CRED_AUT
VALOR_VIVIENDA_ORIG
VALOR_AVALUO*/
public class PersonaCustomTwo {

	private String ID_CREDITO_H;
	private Integer MONTO_CRED_AUT;
	private Integer VALOR_VIVIENDA_ORIG;
	private Integer VALOR_AVALUO;

	public PersonaCustomTwo() {

	}

	public PersonaCustomTwo(String iD_CREDITO_H, Integer mONTO_CRED_AUT, Integer vALOR_VIVIENDA_ORIG,
			Integer vALOR_AVALUO) {

		ID_CREDITO_H = iD_CREDITO_H;
		MONTO_CRED_AUT = mONTO_CRED_AUT;
		VALOR_VIVIENDA_ORIG = vALOR_VIVIENDA_ORIG;
		VALOR_AVALUO = vALOR_AVALUO;
	}

	public String getID_CREDITO_H() {
		return ID_CREDITO_H;
	}

	public void setID_CREDITO_H(String iD_CREDITO_H) {
		ID_CREDITO_H = iD_CREDITO_H;
	}

	public Integer getMONTO_CRED_AUT() {
		return MONTO_CRED_AUT;
	}

	public void setMONTO_CRED_AUT(Integer mONTO_CRED_AUT) {
		MONTO_CRED_AUT = mONTO_CRED_AUT;
	}

	public Integer getVALOR_VIVIENDA_ORIG() {
		return VALOR_VIVIENDA_ORIG;
	}

	public void setVALOR_VIVIENDA_ORIG(Integer vALOR_VIVIENDA_ORIG) {
		VALOR_VIVIENDA_ORIG = vALOR_VIVIENDA_ORIG;
	}

	public Integer getVALOR_AVALUO() {
		return VALOR_AVALUO;
	}

	public void setVALOR_AVALUO(Integer vALOR_AVALUO) {
		VALOR_AVALUO = vALOR_AVALUO;
	}

	@Override
	public String toString() {
		return "PersonaCustomTwo [ID_CREDITO_H=" + ID_CREDITO_H + ", MONTO_CRED_AUT=" + MONTO_CRED_AUT
				+ ", VALOR_VIVIENDA_ORIG=" + VALOR_VIVIENDA_ORIG + ", VALOR_AVALUO=" + VALOR_AVALUO + "]";
	}

}
