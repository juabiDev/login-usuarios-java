/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginusuarios.logica;

import com.mycompany.loginusuarios.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author User
 */
public class ControladoraLogica {
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario usuario) {
        control.crearUsuario(usuario);
    }
    
    public boolean validarUsuario(String name, String password) {
        List<Usuario> listaUsuarios = control.traerListaUsuarios();
        
        for(Usuario usu: listaUsuarios) {
            if(usu.getName().equals(name) && usu.getPassword().equals(password)) {
                return true;
            }
        }
        
        return false;
    }
}
