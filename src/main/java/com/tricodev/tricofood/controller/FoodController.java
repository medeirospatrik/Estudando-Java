package com.tricodev.tricofood.controller;

import com.tricodev.tricofood.modelo.Cliente;
import com.tricodev.tricofood.service.AtivacaoClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    private AtivacaoClienteService ativacaoClienteService;

    public FoodController(AtivacaoClienteService atiacaoClienteService) {
        this.ativacaoClienteService = atiacaoClienteService;

        System.out.println("meu primeiro controller" + atiacaoClienteService);
    }

    @GetMapping("/hello")
    public String hello() {
        Cliente joao = new Cliente("João", "joao@xyz.com", "2198989898");

        ativacaoClienteService.ativarCliente(joao);

        return "Patrik";
    }
}

