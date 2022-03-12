package br.ueg.prog4neo4jdocker.nodes;


import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;


//municio - stuado em -> estado - caracterizado por ->
@Node
public class Estado {

	@Id @GeneratedValue
	private Long id;
	private String estado;
	
	@Relationship(type = "SITUADO_EM", direction = Relationship.Direction.INCOMING)
	private List<Cidade> cidades;
	
	@Relationship(type= "CARACTERIZADO_POR", direction = Relationship.Direction.OUTGOING)
	private List<TurismoEcologico> turismoEcologicos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public List<TurismoEcologico> getTurismoEcologicos() {
		return turismoEcologicos;
	}

	public void setTurismoEcologicos(List<TurismoEcologico> turismoEcologicos) {
		this.turismoEcologicos = turismoEcologicos;
	}

	public Estado(Long id, String estado, List<Cidade> cidades, List<TurismoEcologico> turismoEcologicos) {
		super();
		this.id = id;
		this.estado = estado;
		this.cidades = cidades;
		this.turismoEcologicos = turismoEcologicos;
	}

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidades, estado, id, turismoEcologicos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(cidades, other.cidades) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(turismoEcologicos, other.turismoEcologicos);
	}
	
	
}
