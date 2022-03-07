package br.ueg.prog4neo4jdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.prog4neo4jdocker.nodes.Monumento;
import br.ueg.prog4neo4jdocker.repositories.MonumentoRepository;

@Service
public class MonumentoService {

	@Autowired
	private MonumentoRepository monumentoRepository;
	
	public List<Monumento> listarMonumentos(){
		return monumentoRepository.findAll();
	}
	
	public Monumento buscaMonumentoPorId(long id) {
		return monumentoRepository.findById(id).get();
	}
	
	public Monumento salvarMonumento(Monumento monumento) {
		return monumentoRepository.save(monumento);
	}
	
	public void deletaMonumentoPorId(long id) {
		monumentoRepository.deleteById(id);
	}
}
