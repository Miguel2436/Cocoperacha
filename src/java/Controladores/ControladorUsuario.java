/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entities.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Usuario
 */
@Named("controladorUsuario")
@SessionScoped
public class ControladorUsuario implements Serializable{
    @EJB
    private FachadaUsuario fachada;

    public ControladorUsuario() {
    }
    
    public FachadaUsuario getFachada() {
        return fachada;
    }
    
    public List<Usuario> getUsuarios() {
        return getFachada().findAll();
    }
}
