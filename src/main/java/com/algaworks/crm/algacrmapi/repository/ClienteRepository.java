package com.algaworks.crm.algacrmapi.repository;

import com.algaworks.crm.algacrmapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
