package br.com.plusoft.fivetechcollective.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.fivetechcollective.model.CadastrarCnpj;

@Repository
public interface CadastrarCnpjRepository extends JpaRepository<CadastrarCnpj, Long>{
    
}
