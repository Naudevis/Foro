package com.foro.foro.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foro.foro.Model.Users;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Users, Long>{

}