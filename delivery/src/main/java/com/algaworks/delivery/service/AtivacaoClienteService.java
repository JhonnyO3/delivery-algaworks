package com.algaworks.delivery.service;

import com.algaworks.delivery.model.Cliente;
import com.algaworks.delivery.notificacao.Notifiicador;


public class AtivacaoClienteService {

    private Notifiicador notificar;

    public AtivacaoClienteService(Notifiicador notificar) {
        this.notificar = notificar;

        System.out.println("AtivacaoClienteService");
    }

    public void ativar(Cliente cliente, String message) {

        cliente.ativar();

        notificar.notificar(cliente, message);

    }
}
