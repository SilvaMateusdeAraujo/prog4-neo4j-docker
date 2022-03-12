package br.ueg.prog4neo4jdocker.nodes;

import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Monumento {
	
	@Id @GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	//@TODO alterar ano construção para inicio da construção ou data de inauguração
	private int anoConstrucao;
	
	
	@Relationship(type = "SITUADO_EM", direction = Relationship.Direction.OUTGOING)
	private List<Cidade> cidades;
	
	
	public Monumento(String titulo, String descricao, int anoConstrucao, List<Cidade> cidades) {
		super();
		this.id = null;
		this.titulo = titulo;
		this.descricao = descricao;
		this.anoConstrucao = anoConstrucao;
		this.cidades=cidades;
	}
	
	public Monumento withId(Long id) { 
        if (this.id.equals(id)) {
                return this;
        } else {
                Monumento newObject = new Monumento(this.titulo, this.descricao, this.anoConstrucao, this.cidades);
                newObject.id = id;
                return newObject;
        }
	}

	
	
	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public Monumento() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAnoConstrucao() {
		return anoConstrucao;
	}

	public void setAnoConstrucao(int anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monumento other = (Monumento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
