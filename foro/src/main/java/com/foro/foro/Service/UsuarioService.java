package com.foro.foro.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foro.foro.Model.Users;
import com.foro.foro.Repositorio.UsuarioRepositorio;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepositorio repositoryUsuario;

    public List<Users> listarUsuarios() {
        return repositoryUsuario.findAll();
    }
    public Users guardarUsuario(Users usuario) {
    return repositoryUsuario.save(usuario);
    }
    public Optional<Users> obtenerusuarioPorId(Long id) {
        return repositoryUsuario.findById(id);
    }
    public void eliminarUsuario(Long id) {
        repositoryUsuario.deleteById(id);
    }

    public void actualizarUsuario(Optional<Users> usuario) {
        if (repositoryUsuario.existsById(usuario.get().getCedula())) {
            repositoryUsuario.save(usuario.get());
        }
    }
}
