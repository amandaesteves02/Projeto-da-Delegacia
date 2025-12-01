
package com.delegacia.service;

import org.springframework.stereotype.Service;
import com.delegacia.repository.DepartamentoRepository;
import com.delegacia.model.Departamento;
import java.util.List;

@Service
public class DepartamentoService {
  private final DepartamentoRepository repo;

  public DepartamentoService(DepartamentoRepository repo) { this.repo = repo; }

  public List<Departamento> listar(){ return repo.findAll(); }
  public Departamento salvar(Departamento d){ return repo.save(d); }
}
