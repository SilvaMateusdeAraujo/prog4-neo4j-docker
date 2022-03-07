package br.ueg.prog4neo4jdocker.relationships;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import br.ueg.prog4neo4jdocker.nodes.TurismoEcologico;

@RelationshipProperties
public class Adjacencias {

	@Id @GeneratedValue
	private Long id;
	
	private List<String> adjacencias;
	
	@TargetNode
	private TurismoEcologico turismoEcologico;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getAdjacencias() {
		return adjacencias;
	}

	public void setAdjacencias(List<String> adjacencias) {
		this.adjacencias = adjacencias;
	}

	public TurismoEcologico getTurismoEcologico() {
		return turismoEcologico;
	}

	public void setTurismoEcologico(TurismoEcologico turismoEcologico) {
		this.turismoEcologico = turismoEcologico;
	}
	
	
}
