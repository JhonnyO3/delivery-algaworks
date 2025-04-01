package com.algaworks.delivery.notificacao;


import com.algaworks.delivery.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotifiicadorEmail implements Notifiicador {
    

    public NotifiicadorEmail() {
        System.out.println("NotifiicadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String message) {
        System.out.printf("Notificando via EMAIL o cliente: %s", cliente.getEmail());
    }
}
