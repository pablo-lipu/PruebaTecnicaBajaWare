package com.bajaware.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bajaware.Services.IPersonaService;
import com.bajaware.response.PersonaCustom;
import com.bajaware.response.PersonaCustomTwo;
import com.bajaware.response.PersonaTree;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	IPersonaService IPersonaService;

	@GetMapping("/data/{idPersona}")
	public PersonaCustom persona(@PathVariable Integer idPersona) {
		return IPersonaService.dataPersona(idPersona);
	};

	@GetMapping("/lista")
	public List<PersonaCustomTwo> personaList() {
		return IPersonaService.listPersonas();
	};

	@GetMapping("/estado_civil/{edoCivil}")
	public PersonaTree edoCivil(@PathVariable Integer edoCivil) {
		PersonaTree listaPer = IPersonaService.grupoEdoCivil(edoCivil);
		return listaPer;
	}
}
