
package com.delegacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.delegacia.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {}
