package com.ptt.demoSpring.controler;

import com.ptt.demoSpring.repository.UsuarioRepository;
import com.ptt.demoSpring.repository.modelo.Usuario;
import com.ptt.demoSpring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // a nivel de clase
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
//    public UsuarioController(UsuarioService usuarioService){
//        this.usuarioService = usuarioService;
//
//
//    }


    @GetMapping ("/usuarios/{id}")//getbyId
    public Usuario getById(@PathVariable("id") int id){
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping("/usuarios/")
    public  Usuario addUsuario(Usuario usuario){
        return usuarioService.addUsuario(usuario);

    }
    @PutMapping("/usuarios/")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return  usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping
    public boolean deleteUsuario(@PathVariable("id") int id){
        return  usuarioService.deleteUsuario(id);

    }

}
