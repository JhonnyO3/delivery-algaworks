package com.algaworks.delivery.notificacao;


import com.algaworks.delivery.model.Cliente;
import org.springframework.stereotype.Component;

public class NotifiicadorEmail implements Notifiicador {

    private String smtpServer;

    public NotifiicadorEmail(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public NotifiicadorEmail() {
        System.out.println("NotifiicadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String message) {
        System.out.printf("Notificando via EMAIL o cliente: %s, Servidor de envio: %s", cliente.getEmail(), smtpServer);
    }
}
