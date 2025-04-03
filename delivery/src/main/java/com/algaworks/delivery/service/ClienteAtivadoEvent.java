package com.algaworks.delivery.service;

import com.algaworks.delivery.model.Cliente;
import org.springframework.context.ApplicationEvent;

public class ClienteAtivadoEvent  {

    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
