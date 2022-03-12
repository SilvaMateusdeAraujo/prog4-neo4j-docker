package br.ueg.prog4neo4jdocker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.prog4neo4jdocker.nodes.Estado;
import br.ueg.prog4neo4jdocker.services.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping
	public List<Estado> listaEstados(){
		return estadoService.listaEstados();
	}
	
	@GetMapping("/{id}")
	public Estado buscaEstadoPorId(@PathVariable long id) {
		return estadoService.buscaEstadoPorId(id);
	}
	
	@PostMapping
	public Estado salvarEstado(@RequestBody Estado estado) {
		return estadoService.salvarEstado(estado);
	}

	@PatchMapping("/{id}")
	public Estado alteraEstado(@PathVariable long id, @RequestBody Estado estado){
		return estadoService.alteraEstado(id, estado);
	}
}
