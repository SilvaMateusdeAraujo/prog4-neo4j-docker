package br.ueg.prog4neo4jdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.prog4neo4jdocker.nodes.PontoTuristico;
import br.ueg.prog4neo4jdocker.repositories.PontoTuristicoRepository;

@Service
public class PontoTuristicoService {

	@Autowired
	private PontoTuristicoRepository pontoTuristicoRepository;
	
	public List<PontoTuristico> listarPontosTuristicos(){
		return pontoTuristicoRepository.findAll();
	}
	
	public PontoTuristico salvarPontoTuristico(PontoTuristico pontoTuristico) {
		pontoTuristico.setId((long)((Math.random() * (1000-3)) +3));
		return pontoTuristicoRepository.save(pontoTuristico);
	}
}
