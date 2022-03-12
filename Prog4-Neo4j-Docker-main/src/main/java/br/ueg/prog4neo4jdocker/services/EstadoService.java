package br.ueg.prog4neo4jdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.prog4neo4jdocker.repositories.EstadoRepository;
import br.ueg.prog4neo4jdocker.nodes.Estado;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listaEstados(){
		return estadoRepository.findAll();
	}
	
	public Estado salvarEstado(Estado estado) {
		return estadoRepository.save(estado);
	}
	
	public Estado buscaEstadoPorId(long id) {
		return estadoRepository.findById(id).get();
	}
	
	public Estado alteraEstado(long id, Estado estado) {
		Estado temporario = estadoRepository.findById(id).get();
		
		temporario.setId(id);
		temporario.setEstado(estado.getEstado());
		temporario.setCidades(estado.getCidades());
		temporario.setTurismoEcologicos(estado.getTurismoEcologicos());
		
		return estadoRepository.save(temporario);
	}
	
	public void deletaEstado(long id) {
		estadoRepository.deleteById(id);
	}
}
