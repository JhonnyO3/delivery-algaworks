package com.algaworks.delivery.listener;

import com.algaworks.delivery.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotaFiscalService {

    @EventListener
    private void gerarNotaFiscalListener(ClienteAtivadoEvent clienteAtivadoEvent) {
        System.out.printf("Nota fiscal do cliente %s emtida com sucesso! \n",clienteAtivadoEvent.getCliente().getEmail() );
    }
}
