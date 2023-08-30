package com.bajaware.Services;

import java.util.List;

import com.bajaware.response.PersonaCustom;
import com.bajaware.response.PersonaCustomTwo;
import com.bajaware.response.PersonaTree;

public interface IPersonaService {

	public PersonaCustom dataPersona(Integer idPersona);
	
	public List<PersonaCustomTwo> listPersonas();
	
      public PersonaTree grupoEdoCivil(Integer edoCivil);
}
