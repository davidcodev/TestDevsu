package com.micro.customer.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * Objeto usado para setear los campos de un cliente que se eliminará
 */
@Getter @Setter
public class CustomerUpdateDTO {
    @NotEmpty(message = "No se ha encontrado")
    private String nombre;
    @NotEmpty(message = "No se ha encontrado")
    private String genero;
    @NotNull(message = "No se ha encontrado")
    private Integer edad;
    private String direccion;
    private String telefono;
    @NotEmpty(message = "No se ha encontrado")
    private String contrasena;
    @NotNull(message = "No se ha encontrado")
    private Boolean estado;
}
