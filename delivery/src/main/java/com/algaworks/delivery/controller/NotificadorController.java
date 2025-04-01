package com.algaworks.delivery.controller;

import com.algaworks.delivery.model.Cliente;
import com.algaworks.delivery.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;

@Controller
public class NotificadorController {

    private AtivacaoClienteService ativacaoClienteService;

    public NotificadorController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("NotificadorController");
    }

    public void hello() {

        System.out.println("hello world");
        Cliente cliente = new Cliente("jhon", "honatas2004@gmail.com");
        ativacaoClienteService.ativar(cliente, "atvou");
    }

}
