package com.micro.account.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class UpdateAccountDTO {
    @NotNull(message = "No se ha encontrado")
    private Long id;
    @NotNull(message = "No se ha encontrado")
    private Long nroCuenta;
    @NotEmpty(message = "No se ha encontrado")
    private String tipo;
    private BigDecimal saldoInicial;
    @NotNull(message = "No se ha encontrado")
    private Boolean estado;
}
