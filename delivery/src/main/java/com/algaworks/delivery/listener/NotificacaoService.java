package com.algaworks.delivery.listener;

import com.algaworks.delivery.notificacao.GrauNotificacao;
import com.algaworks.delivery.notificacao.Notifiicador;
import com.algaworks.delivery.notificacao.TipoNotificador;
import com.algaworks.delivery.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoNotificador(GrauNotificacao.NORMAL)
    private final Notifiicador notificar;

    @TipoNotificador(GrauNotificacao.NORMAL)
    public NotificacaoService(Notifiicador notificar) {
        this.notificar = notificar;
    }


    @EventListener
    public void notificarListener(ClienteAtivadoEvent clienteAtivadoEvent) {
        notificar.notificar(clienteAtivadoEvent.getCliente(), "Realizando notificacao");
    }
}
