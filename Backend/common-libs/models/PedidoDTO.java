package com.sistemadepedidos.common.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
    private String id;
    private String clienteId;
    private double valorTotal;
    private String status;
}