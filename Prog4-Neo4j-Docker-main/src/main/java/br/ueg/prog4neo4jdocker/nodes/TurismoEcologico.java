package br.ueg.prog4neo4jdocker.nodes;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class TurismoEcologico {

	@Id @GeneratedValue
	private Long id;
	private String bioma;
	private String clima;
	private boolean aguaTermal;
	private boolean praiaFluvial;
	private boolean praia;
	private boolean quedaDagua;
	private boolean gruta;
	private boolean lago;
		
	//@TODO declarar o tipo do relacionamento na variavel
	@Relationship(type = "ADJACENTE_A", direction = Relationship.Direction.OUTGOING)
	private List<TurismoEcologico> turismoEcologicoOut;
	

	
	public TurismoEcologico(String bioma, String clima, boolean aguaTermal, boolean praia, boolean praiaFluvial,
			boolean quedaDagua, boolean gruta, boolean lago, List<TurismoEcologico> turismoEcologicoOut) {
		super();
		this.id = null;
		this.bioma = bioma;
		this.clima = clima;
		this.aguaTermal = aguaTermal;
		this.praia = praia;
		this.praiaFluvial = praiaFluvial;
		this.quedaDagua = quedaDagua;
		this.gruta = gruta;
		this.lago = lago;
		this.turismoEcologicoOut = turismoEcologicoOut;
	}

	public TurismoEcologico withId(Long id) { 
        if (this.id.equals(id)) {
                return this;
        } else {
                TurismoEcologico newObject = new TurismoEcologico(this.bioma, this.clima, this.aguaTermal, this.praia, this.praiaFluvial, this.quedaDagua, this.gruta, this.lago, this.turismoEcologicoOut);
                newObject.id = id;
                return newObject;
        }
	}

	
	public TurismoEcologico() {
		super();
	}
	
	
	public List<TurismoEcologico> getTurismoEcologicoOut() {
		return turismoEcologicoOut;
	}

	public void setTurismoEcologicoOut(List<TurismoEcologico> turismoEcologicoOut) {
		this.turismoEcologicoOut = turismoEcologicoOut;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBioma() {
		return bioma;
	}

	public void setBioma(String bioma) {
		this.bioma = bioma;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public boolean isAguaTermal() {
		return aguaTermal;
	}

	public void setAguaTermal(boolean aguaTermal) {
		this.aguaTermal = aguaTermal;
	}
	
	public boolean isPraia() {
		return praia;
	}

	public void setPraia(boolean praia) {
		this.praia = praia;
	}
	
	
	public boolean isPraiaFluvial() {
		return praiaFluvial;
	}

	public void setPraiaFluvial(boolean praiaFluvial) {
		this.praiaFluvial = praiaFluvial;
	}
	

	public boolean isQuedaDagua() {
		return quedaDagua;
	}

	public void setQuedaDagua(boolean quedaDagua) {
		this.quedaDagua = quedaDagua;
	}

	public boolean isGruta() {
		return gruta;
	}

	public void setGruta(boolean gruta) {
		this.gruta = gruta;
	}

	public boolean isLago() {
		return lago;
	}

	public void setLago(boolean lago) {
		this.lago = lago;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		TurismoEcologico other = (TurismoEcologico) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
