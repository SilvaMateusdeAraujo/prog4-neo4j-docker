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

import br.ueg.prog4neo4jdocker.nodes.Monumento;
import br.ueg.prog4neo4jdocker.services.CidadeService;
import br.ueg.prog4neo4jdocker.services.MonumentoService;

@RestController
@RequestMapping("/monumentos")
public class MonumentoController {
	@Autowired
	CidadeService cidadeService;
	
	@Autowired
	private MonumentoService monumentoService;
	
	@GetMapping
	public List<Monumento> listarMonumentos(){
		return monumentoService.listarMonumentos();
	}
	
	@GetMapping("/{id}")
	public Monumento buscaMonumentoPorId(@PathVariable long id) {
		return monumentoService.buscaMonumentoPorId(id);
	}
	
	@PostMapping
	public Monumento salvarMonumento(@RequestBody Monumento monumento) {
		if(monumento.getCidades()==null) {
			System.out.println("Monumento será criado sem relacionamentos");
			return monumentoService.salvarMonumento(monumento); 
		}
		else {
			System.out.println("Cidade a ser criada " + monumento.getCidades().get(0).getMunicipio());		
			return monumentoService.salvarMonumento(monumento);
		}
	}

	@DeleteMapping("/{id}")
	public void deleteMonumento(@PathVariable long id) {
		monumentoService.deletaMonumentoPorId(id);
	}
	
	@PatchMapping("/{id}")
	public Monumento alteraMonumento(@PathVariable long id, @RequestBody Monumento monumento) {
		return monumentoService.alteraMonumentoPorId(id, monumento);
	}
	
}
