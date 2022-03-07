package br.ueg.prog4neo4jdocker.relationships;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import br.ueg.prog4neo4jdocker.nodes.Cidade;

@RelationshipProperties
public class Situado {

	
	
	@Id @GeneratedValue
	private Long id;
	
	private List<String> situado;
	
	@TargetNode
	private Cidade cidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getSituado() {
		return situado;
	}

	public void setSituado(List<String> situado) {
		this.situado = situado;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Situado(Long id, List<String> situado, Cidade cidade) {
		super();
		this.id = id;
		this.situado = situado;
		this.cidade = cidade;
	}

	public Situado() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Situado other = (Situado) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
