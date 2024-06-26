package br.com.plusoft.fivetechcollective.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.fivetechcollective.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
}
