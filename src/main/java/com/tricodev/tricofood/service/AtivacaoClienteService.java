package com.tricodev.tricofood.service;

import com.tricodev.tricofood.modelo.Cliente;
import com.tricodev.tricofood.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativarCliente(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
    }
}
