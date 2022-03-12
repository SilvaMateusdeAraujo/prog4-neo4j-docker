package br.ueg.prog4neo4jdocker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.prog4neo4jdocker.services.PatrimonioMundialService;
import br.ueg.prog4neo4jdocker.nodes.PatrimonioMundial;

@RestController
@RequestMapping("/PatrimonioMundial")
public class PatrimonioMundialController {

	@Autowired
	PatrimonioMundialService patrimonioMundialService;
	
	@GetMapping
	public List<PatrimonioMundial> listaPatrimonioMundial(){
		return patrimonioMundialService.listaPatrimonioMundial();
	}
	
	@PostMapping
	public PatrimonioMundial salvarPatrimonioMundial(@RequestBody PatrimonioMundial patrimonioMundial) {
		return patrimonioMundialService.salvarPatrimonioMundial(patrimonioMundial);
	}
	
	@GetMapping("/{id}")
	public PatrimonioMundial buscaPatrimonioMundialPorId(@PathVariable long id) {
		return patrimonioMundialService.buscaPatrimonioMundial(id);
	}
	
	@PatchMapping("/{id}")
	public PatrimonioMundial alteraPatrimonioMundial(@PathVariable long id, @RequestBody PatrimonioMundial patrimonioMundial) {
		return patrimonioMundialService.alteraPatrimonioMundial(id, patrimonioMundial);
	}
	
	@DeleteMapping("/{id}")
	public void deletaPatrimonioMundial(@PathVariable long id) {
		patrimonioMundialService.deletaPatrimonioMundial(id);
	}
}
