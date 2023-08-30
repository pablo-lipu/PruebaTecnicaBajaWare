package com.bajaware.service.imp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bajaware.Repository.IPersonaRepository;
import com.bajaware.Services.IPersonaService;
import com.bajaware.entities.PersonaEntity;
import com.bajaware.response.PersonaCustom;
import com.bajaware.response.PersonaCustomTwo;
import com.bajaware.response.PersonaTree;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	IPersonaRepository personaRepository;

	@Override
	public PersonaCustom dataPersona(Integer idPersona) {
		Optional<PersonaEntity> persona = personaRepository.findById(idPersona);
		PersonaCustom personaCustom = new PersonaCustom();
		if (!persona.isEmpty()) {

			Integer idPersonaCustom = persona.get().getIdPersona();
			Integer genderCustom = persona.get().getGenero();
			Integer edadAcred = persona.get().getEdadEcreditado();
			Integer edoCivil = persona.get().getEstadoCivil();

			personaCustom.setID_PERSONA(idPersonaCustom);
			personaCustom.setGenero(genderCustom);
			personaCustom.setEDAD_ACREDITADO(edadAcred);
			personaCustom.setESTADO_CIVIL(edoCivil);

			return personaCustom;
		} else {
			System.out.println("esta vacio...");
		}
		return null;
	}

	@Override
	public List<PersonaCustomTwo> listPersonas() {
		List<PersonaEntity> listPerson = personaRepository.listaPersonas();
		List<PersonaCustomTwo> listaPersonaTwo = new ArrayList<>();
		for (PersonaEntity persona : listPerson) {
			Integer valorVivOr = persona.getValorViviendaOrig();
			Integer montoCreditAut = persona.getMontoCredAut();
			if (valorVivOr > montoCreditAut) {
				PersonaCustomTwo personaCustomTwo = new PersonaCustomTwo();
				personaCustomTwo.setID_CREDITO_H(persona.getIdCreditoH());
				personaCustomTwo.setMONTO_CRED_AUT(persona.getMontoCredAut());
				personaCustomTwo.setVALOR_AVALUO(persona.getValor_avaluo());
				personaCustomTwo.setVALOR_VIVIENDA_ORIG(valorVivOr);
				listaPersonaTwo.add(personaCustomTwo);

			} else {
				System.out.println("No hay valores tales...");
			}
		}
		return listaPersonaTwo;
	}

	@Override
	public PersonaTree grupoEdoCivil(Integer edoCivil) {
		List<Object[]> results = personaRepository.agruparEstadoCivilYSumarMontosubcuenta(edoCivil);
		PersonaTree per = new PersonaTree();
		for (Object[] result : results) {
			Integer value = ((Integer) result[0]).intValue();
			Long value2 = ((BigInteger) result[1]).longValue();
            per.setEstadoCivil(value);
	        per.setMontoSubcuenta(value2);
		}
		return per;
	}

}
