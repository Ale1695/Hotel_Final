/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author sales
 */
public class Administrador extends Persona {

    private TipoEmpleado tipo;
    private List<String> funciones;
    private Estado estado;

    public Administrador(TipoEmpleado tipo, List<String> funciones, Estado estado) {
        this.tipo = tipo;
        this.funciones = funciones;
        this.estado = estado;
    }

    public Administrador(TipoEmpleado tipo, List<String> funciones, Estado estado, String Cedula, String Nombre, String Apellido1, String Apellido2) {
        super(Cedula, Nombre, Apellido1, Apellido2);
        this.tipo = tipo;
        this.funciones = funciones;
        this.estado = estado;
    }

    /**
     * @return the tipo
     */
    public TipoEmpleado getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the funciones
     */
    public List<String> getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(List<String> funciones) {
        this.funciones = funciones;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
