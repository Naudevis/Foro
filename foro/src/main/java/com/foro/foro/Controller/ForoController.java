package com.foro.foro.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.foro.foro.Model.Users;
import com.foro.foro.Service.UsuarioService;

@Controller
public class ForoController {
    Users usuario ;
    @GetMapping("/")
    public String Inicio(Model model) {
        model.addAttribute("usuarios", usuarioService.listarUsuarios());
        return "Inicio";
    }

      @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/VistaUsuario")
    public String IniciarSesion(@RequestParam("id") Long id,Model model) {
        try{
             usuario = usuarioService.obtenerusuarioPorId(id).orElse(null);
                
            model.addAttribute("user", usuario);
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
          
           
        }
        return "ListaTemas";
      
        
    }
    @GetMapping("/Usuarios")
    public String ListaUsuario(Model model) {
        model.addAttribute("usuarios", usuarioService.listarUsuarios());
        model.addAttribute("user", usuario);
        return"ListaUsuarios";
    }
    @GetMapping("/Perfil")
    public String FormContactos(Model model) {
        model.addAttribute("user", usuario);
        return"Perfil";
    }
    
    
}
