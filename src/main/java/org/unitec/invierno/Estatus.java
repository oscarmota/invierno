/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.invierno;

/**
 * Entidad solo contiene atribuos y estan manipuladas
 * 
 * Aplicacion: solo hay una y tiene el mantenimineto
* 
 * 
 * Modelo:hay varias y tienen logica de programacion
 * 
 * 
 * 
 */



public class Estatus {
    String mensaje;
    boolean success;

    public Estatus() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
