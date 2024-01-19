package com.micro.account.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * Se utiliza para modelar los datos para eliminar una cuenta
 */
@Getter @Setter
public class DeleteAccountDTO {
    @NotNull(message = "No se ha encontrado")
    private Long nroCuenta;
    @NotEmpty(message = "No se ha encontrado")
    private String tipo;
}
