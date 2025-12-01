
package com.delegacia.controller;

import com.delegacia.model.Departamento;
import com.delegacia.service.DepartamentoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
  private final DepartamentoService service;

  public DepartamentoController(DepartamentoService service){ this.service = service; }

  @GetMapping
  public String listar(Model m){
    m.addAttribute("lista", service.listar());
    return "departamentos/lista";
  }

  @GetMapping("/novo")
  public String novo(Model m){
    m.addAttribute("dep", new Departamento());
    return "departamentos/form";
  }

  @PostMapping
  public String salvar(Departamento d){
    service.salvar(d);
    return "redirect:/departamentos";
  }
}
