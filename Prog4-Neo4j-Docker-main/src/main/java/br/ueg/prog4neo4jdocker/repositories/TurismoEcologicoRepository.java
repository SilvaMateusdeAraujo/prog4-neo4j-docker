package br.ueg.prog4neo4jdocker.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import br.ueg.prog4neo4jdocker.nodes.TurismoEcologico;

@Repository
public interface TurismoEcologicoRepository extends Neo4jRepository<TurismoEcologico, Long>{

}
