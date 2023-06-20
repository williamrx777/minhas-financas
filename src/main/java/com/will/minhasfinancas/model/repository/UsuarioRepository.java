package com.will.minhasfinancas.model.repository;

import com.will.minhasfinancas.model.entily.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    boolean existsByEmail(String email);

}
