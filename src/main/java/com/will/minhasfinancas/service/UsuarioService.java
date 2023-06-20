package com.will.minhasfinancas.service;

import com.will.minhasfinancas.model.entily.Usuario;

public interface UsuarioService {
    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);
}
