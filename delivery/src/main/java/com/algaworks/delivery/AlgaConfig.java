package com.algaworks.delivery;

import com.algaworks.delivery.notificacao.Notifiicador;
import com.algaworks.delivery.notificacao.NotifiicadorEmail;
import com.algaworks.delivery.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

    @Bean
    public NotifiicadorEmail notifiicadorEmail() {
        return new NotifiicadorEmail("smtp.server.algaworks");
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notifiicador notifiicador) {
        return new AtivacaoClienteService(notifiicador);
    }
}
