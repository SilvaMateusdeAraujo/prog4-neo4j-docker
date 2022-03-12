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

import br.ueg.prog4neo4jdocker.nodes.Cidade;
import br.ueg.prog4neo4jdocker.services.CidadeService;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping
	public List <Cidade> listarCidades(){
		return cidadeService.listarCidades();
	}
	
	@GetMapping("/{id}")
	public Cidade buscaCidadePorId(@PathVariable long id) {
		return cidadeService.buscaCidadePorId(id);
	}
	
	@PostMapping
	public Cidade salvarCidade(@RequestBody Cidade cidade) {
		return cidadeService.salvarCidade(cidade);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCidade(@PathVariable long id) {
		cidadeService.deletaCidadePorId(id);
	}
	
	@PatchMapping("/{id}")
	public Cidade alteraCidade(@PathVariable long id, @RequestBody Cidade cidade) {
		return cidadeService.alteraCidade(id, cidade);
	}
}
