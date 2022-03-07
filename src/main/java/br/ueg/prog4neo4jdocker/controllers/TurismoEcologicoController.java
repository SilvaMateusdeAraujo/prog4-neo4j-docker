package br.ueg.prog4neo4jdocker.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.prog4neo4jdocker.nodes.TurismoEcologico;
import br.ueg.prog4neo4jdocker.services.TurismoEcologicoService;

@RestController
@RequestMapping("/turismoEcologico")
public class TurismoEcologicoController {
	
	@Autowired
	private TurismoEcologicoService turismoEcologicoService;

	@GetMapping
	public List<TurismoEcologico> listarTurismoEcologico(){
		return turismoEcologicoService.listarTurismoEcologico();
	}
	
	@PostMapping
	public TurismoEcologico salvarTurismoEcologico(@RequestBody TurismoEcologico turismoEcologico) {
		return turismoEcologicoService.salvarTurismoEcologico(turismoEcologico);
	}
	
	@GetMapping("/{id}")
	public TurismoEcologico buscaTurismoEcologicoPorId(@PathVariable long id) {
		return turismoEcologicoService.buscaTurismoEcologicoPorId(id);
	}
	
	
	@PutMapping("/{id}")
	public TurismoEcologico alteraTurismoEcologico(@PathVariable long id, @RequestBody TurismoEcologico turismoEcologico) {
		return turismoEcologicoService.alteraTurismoEcologico(id, turismoEcologico);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteTurismoEcologico(@PathVariable long id) {
		turismoEcologicoService.deletaTurismoEcologicoPorId(id);
	}
}
