package com.tricodev.tricofood.notificacao;

import com.tricodev.tricofood.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atraves do e-mail: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
