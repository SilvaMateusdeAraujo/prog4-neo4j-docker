package br.ueg.prog4neo4jdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.prog4neo4jdocker.repositories.PatrimonioMundialRepository;
import br.ueg.prog4neo4jdocker.nodes.PatrimonioMundial;

@Service
public class PatrimonioMundialService {

	@Autowired
	private PatrimonioMundialRepository patrimonioMundialRepository;
	
	public List<PatrimonioMundial> listaPatrimonioMundial(){
		return patrimonioMundialRepository.findAll();
	}
	
	public PatrimonioMundial salvarPatrimonioMundial(PatrimonioMundial patrimonioMundial) {
		return patrimonioMundialRepository.save(patrimonioMundial);
	}
	
	public PatrimonioMundial buscaPatrimonioMundial(long id) {
		return patrimonioMundialRepository.findById(id).get();
	}
	
	public PatrimonioMundial alteraPatrimonioMundial(long id, PatrimonioMundial patrimonioMundial) {
		PatrimonioMundial temporario = patrimonioMundialRepository.findById(id).get();
		temporario.setId(id);
		temporario.setSitio(patrimonioMundial.getSitio());
		temporario.setDescricao(patrimonioMundial.getDescricao());
		temporario.setAnoInscricao(patrimonioMundial.getAnoInscricao());
		temporario.setPatrimonioMundialNatural(patrimonioMundial.isPatrimonioMundialNatural());
		temporario.setPatrimonioMundialCultural(patrimonioMundial.isPatrimonioMundialCultural());
		
		temporario.setCidades(patrimonioMundial.getCidades());
		temporario.setTurismoEcologicos(patrimonioMundial.getTurismoEcologicos());
		
		return patrimonioMundialRepository.save(temporario);
	}
	
	public void deletaPatrimonioMundial(long id) {
		patrimonioMundialRepository.deleteById(id);
	}
	
}
