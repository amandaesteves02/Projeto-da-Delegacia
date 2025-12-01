
package com.delegacia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Chamado {
  @Id @GeneratedValue
  private Long id;
  private String titulo;
  private String descricao;

  @ManyToOne
  private Departamento departamento;
}
