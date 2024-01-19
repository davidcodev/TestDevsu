package com.micro.account.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Se utiliza para modelar los datos de la creación de una cuenta
 */
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CreateAccountDTO {
    @NotNull(message = "No se ha encontrado")
    private Long nroCuenta;
    @NotEmpty(message = "No se ha encontrado")
    private String tipo;
    private BigDecimal saldoInicial;
    @NotNull(message = "No se ha encontrado")
    private Boolean estado;
    @NotNull(message = "No se ha encontrado")
    private Long idCliente;
}
