package br.ueg.prog4neo4jdocker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.prog4neo4jdocker.nodes.PontoTuristico;
import br.ueg.prog4neo4jdocker.services.PontoTuristicoService;

@RestController
@RequestMapping("/pontosTuristicos")
public class PontoTuristicoController {

	@Autowired
	private PontoTuristicoService pontoTuristicoService;
	
	@GetMapping
	public List<PontoTuristico> listarPontosTuristicos(){
		return pontoTuristicoService.listarPontosTuristicos();
	}
	
	@PostMapping
	public PontoTuristico salvarPontoTuristico(@RequestBody PontoTuristico pontoTuristico) {
		return pontoTuristicoService.salvarPontoTuristico(pontoTuristico);
	}
	
}
