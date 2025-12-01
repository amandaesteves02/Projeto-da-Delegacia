
package com.delegacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.delegacia.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {}
