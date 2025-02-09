package com.tricodev.tricofood.notificacao;

import com.tricodev.tricofood.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
