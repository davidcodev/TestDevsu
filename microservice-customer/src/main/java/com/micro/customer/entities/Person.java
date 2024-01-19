package com.micro.customer.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

/**
 * Objeto Persona (no es entidad porque así lo pide el ejercicio)
 * Por esta razón se anota con MappedSuperclass, para que información de mapeo se aplique a las entidades
 * que heredan de esta
 */
@MappedSuperclass
@Getter @Setter
public class Person {
    @Column(unique = true)
    @NotEmpty(message = "no se ha encontrado")
    private String identificacion;
    @NotEmpty(message = "no se ha encontrado")
    private String nombre;
    private String genero;
    private int edad;
    private String direccion;
    private String telefono;
}
