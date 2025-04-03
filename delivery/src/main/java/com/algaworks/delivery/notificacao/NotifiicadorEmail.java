package com.algaworks.delivery.notificacao;


import com.algaworks.delivery.model.Cliente;
import org.springframework.stereotype.Component;

@Component
@TipoNotificador(GrauNotificacao.NORMAL)
public class NotifiicadorEmail implements Notifiicador {

    private final String smtpServer =  "smtp.server.algaworks";


    @Override
    public void notificar(Cliente cliente, String message) {
        System.out.printf("Notificando via EMAIL o cliente: %s, Servidor de envio: %s", cliente.getEmail(), smtpServer);
    }
}
