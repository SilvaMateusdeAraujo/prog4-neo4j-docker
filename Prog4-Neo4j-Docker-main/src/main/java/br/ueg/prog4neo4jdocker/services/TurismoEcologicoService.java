package br.ueg.prog4neo4jdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.prog4neo4jdocker.nodes.TurismoEcologico;
import br.ueg.prog4neo4jdocker.repositories.TurismoEcologicoRepository;

@Service
public class TurismoEcologicoService {

	@Autowired
	private TurismoEcologicoRepository turismoEcologicoRepository;
	
	public List<TurismoEcologico> listarTurismoEcologico(){
		return turismoEcologicoRepository.findAll();
	}
	
	public TurismoEcologico salvarTurismoEcologico(TurismoEcologico turismoEcologico) {
		//turismoEcologico.setId(((long)(Math.random() * (1000-3)) + 3));
		return turismoEcologicoRepository.save(turismoEcologico);
	}
	
	public TurismoEcologico buscaTurismoEcologicoPorId(long id) {
		return turismoEcologicoRepository.findById(id).get();
	}
	
	
	public TurismoEcologico alteraTurismoEcologico(long id, TurismoEcologico turismoEcologico) {
		TurismoEcologico temporario = turismoEcologicoRepository.findById(id).get();
		temporario.setId(id);
		temporario.setBioma(turismoEcologico.getBioma());
		temporario.setClima(turismoEcologico.getClima());
		temporario.setAguaTermal(turismoEcologico.isAguaTermal());
		temporario.setPraiaFluvial(turismoEcologico.isPraiaFluvial());
		temporario.setPraia(turismoEcologico.isPraia());
		temporario.setQuedaDagua(turismoEcologico.isQuedaDagua());
		temporario.setGruta(turismoEcologico.isGruta());
		temporario.setLago(turismoEcologico.isLago());
		temporario.setTurismoEcologicoOut(turismoEcologico.getTurismoEcologicoOut());
		
		return turismoEcologicoRepository.save(temporario);
	}
	
	
	public void deletaTurismoEcologicoPorId(long id) {
		turismoEcologicoRepository.deleteById(id);
	}
}
