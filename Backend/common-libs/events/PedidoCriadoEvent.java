package com.sistemadepedidos.common.events;

import com.sistemadepedidos.common.models.PedidoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoCriadoEvent {
    private String eventId;
    private long timestamp;
    private PedidoDTO pedido;
}