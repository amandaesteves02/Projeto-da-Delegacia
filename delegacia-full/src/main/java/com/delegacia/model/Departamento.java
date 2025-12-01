
package com.delegacia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Departamento {
  @Id @GeneratedValue
  private Long id;
  private String nome;
}
