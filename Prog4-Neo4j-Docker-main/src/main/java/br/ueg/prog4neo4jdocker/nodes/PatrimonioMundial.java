package br.ueg.prog4neo4jdocker.nodes;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;



@Node
public class PatrimonioMundial {

	@Id @GeneratedValue
	private Long id;
	private String sitio;
	private String descricao;
	private int anoInscricao;
	private boolean patrimonioMundialNatural;
	private boolean patrimonioMundialCultural;
	
	@Relationship(type = "RECONHECIDO_POR", direction = Relationship.Direction.INCOMING)
	private List<Cidade> cidades;
	
	@Relationship(type = "RECONHECIDO_POR", direction = Relationship.Direction.INCOMING)
	private List<TurismoEcologico> turismoEcologicos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAnoInscricao() {
		return anoInscricao;
	}

	public void setAnoInscricao(int anoInscricao) {
		this.anoInscricao = anoInscricao;
	}

	public boolean isPatrimonioMundialNatural() {
		return patrimonioMundialNatural;
	}

	public void setPatrimonioMundialNatural(boolean patrimonioMundialNatural) {
		this.patrimonioMundialNatural = patrimonioMundialNatural;
	}

	public boolean isPatrimonioMundialCultural() {
		return patrimonioMundialCultural;
	}

	public void setPatrimonioMundialCultural(boolean patrimonioMundialCultural) {
		this.patrimonioMundialCultural = patrimonioMundialCultural;
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

	public PatrimonioMundial(Long id, String sitio, String descricao, int anoInscricao,
			boolean patrimonioMundialNatural, boolean patrimonioMundialCultural, List<Cidade> cidades, List<TurismoEcologico> turismoEcologicos) {
		super();
		this.id = id;
		this.sitio = sitio;
		this.descricao = descricao;
		this.anoInscricao = anoInscricao;
		this.patrimonioMundialNatural = patrimonioMundialNatural;
		this.patrimonioMundialCultural = patrimonioMundialCultural;
		this.cidades = cidades;
		this.turismoEcologicos = turismoEcologicos;
	}

	public PatrimonioMundial() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoInscricao, cidades, descricao, id, patrimonioMundialCultural, patrimonioMundialNatural,
				sitio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatrimonioMundial other = (PatrimonioMundial) obj;
		return anoInscricao == other.anoInscricao && Objects.equals(cidades, other.cidades)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& patrimonioMundialCultural == other.patrimonioMundialCultural
				&& patrimonioMundialNatural == other.patrimonioMundialNatural && Objects.equals(sitio, other.sitio);
	}
	
}
