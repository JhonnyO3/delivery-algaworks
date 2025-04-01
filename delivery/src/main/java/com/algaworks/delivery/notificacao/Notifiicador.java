package com.algaworks.delivery.notificacao;

import com.algaworks.delivery.model.Cliente;

public interface Notifiicador {

    void notificar(Cliente cliente, String message);
}
