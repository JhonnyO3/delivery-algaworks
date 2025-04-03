package com.algaworks.delivery.controller;

import com.algaworks.delivery.model.Cliente;
import com.algaworks.delivery.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificadorController {

    private AtivacaoClienteService ativacaoClienteService;

    public NotificadorController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    public String hello() {
        Cliente cliente = new Cliente("jhon", "honatas2004@gmail.com");
        ativacaoClienteService.ativar(cliente, "atvou");

        return "hello world";
    }

}
