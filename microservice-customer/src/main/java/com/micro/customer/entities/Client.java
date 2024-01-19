package com.micro.customer.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad Cliente que extiende de Person, su id es autoincremental
 */
@Entity
@Table(name = "client")
@Getter @Setter
public class Client extends Person {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    @NotEmpty(message = "no se ha encontrado")
    private String contrasena;
    private Boolean estado;
}
