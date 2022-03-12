package br.ueg.prog4neo4jdocker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.prog4neo4jdocker.nodes.Cidade;
import br.ueg.prog4neo4jdocker.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<Cidade> listarCidades(){
		return cidadeRepository.findAll();
	}
	
	public Cidade buscaCidadePorId(long id) {
		return cidadeRepository.findById(id).get();
	}
	
	public Cidade salvarCidade(Cidade cidade) {
		return cidadeRepository.save(cidade);
	}
	
	public void deletaCidadePorId(long id) {
		cidadeRepository.deleteById(id);
	}
	
	public Cidade alteraCidade(long id, Cidade cidade) {
		Cidade temporario = cidadeRepository.findById(id).get();
		temporario.setId(id);
		temporario.setMunicipio(cidade.getMunicipio());
		temporario.setEstado(cidade.getEstado());
		return cidadeRepository.save(temporario);
	}
}
