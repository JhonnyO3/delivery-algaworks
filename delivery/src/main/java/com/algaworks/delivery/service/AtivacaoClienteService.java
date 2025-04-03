package com.algaworks.delivery.service;

import com.algaworks.delivery.model.Cliente;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public AtivacaoClienteService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void ativar(Cliente cliente, String message) {
        cliente.ativar();
        applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

    }
}
