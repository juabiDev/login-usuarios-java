/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginusuarios.persistencia;

import com.mycompany.loginusuarios.logica.Usuario;
import java.util.List;

/**
 *
 * @author User
 */
public class ControladoraPersistencia {
    UsuarioJpaController usuario = new UsuarioJpaController();
    
    public void crearUsuario(Usuario usuario) {
        this.usuario.create(usuario);
    }

    public List<Usuario> traerListaUsuarios() {
        return this.usuario.findUsuarioEntities();
    }
}
