package com.micro.account.dto.movementDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DepositoDTO {
    @NotNull(message = "No se ha encontrado")
    private Long nroCuenta;
    @NotEmpty(message = "No se ha encontrado")
    private String tipoCuenta;
    @NotNull(message = "No se ha encontrado")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "UTC")
    private LocalDateTime fecha;
    @NotNull(message = "No se ha encontrado")
    private BigDecimal valor;
}
