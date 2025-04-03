package com.algaworks.delivery.notificacao;


import com.algaworks.delivery.model.Cliente;
import org.springframework.stereotype.Component;

@Component
@TipoNotificador(GrauNotificacao.URGENTE)
public class NotifiicadorSMS implements Notifiicador {

    private final String smtpServer = "smtp.server.algaworks";

    public NotifiicadorSMS() {
        System.out.println("NotifiicadorSMS");
    }

    @Override
    public void notificar(Cliente cliente, String message) {
        System.out.printf("Notificando via SMS o cliente: %s, Servidor de envio: %s", cliente.getEmail(), smtpServer);
    }
}
