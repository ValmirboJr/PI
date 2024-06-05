package com.knnovais.aula_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knnovais.aula_api.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario  findByEmail(String email);
    boolean existsByEmail(String email);
}
