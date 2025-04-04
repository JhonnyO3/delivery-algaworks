package com.algaworks.delivery.notificacao;


import com.algaworks.delivery.model.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@TipoNotificador(GrauNotificacao.NORMAL)
public class NotifiicadorEmail implements Notifiicador {

    private final NotificadorProperties notificadorProperties;

    public NotifiicadorEmail(NotificadorProperties notificadorProperties) {
        this.notificadorProperties = notificadorProperties;
    }


    @Override
    public void notificar(Cliente cliente, String message) {
        System.out.println("Host: " + notificadorProperties.getHostServidor());
        System.out.printf("Notificando via EMAIL o cliente: %s, Servidor de envio: %s", cliente.getEmail(), notificadorProperties.getHostServidor());
    }
}
