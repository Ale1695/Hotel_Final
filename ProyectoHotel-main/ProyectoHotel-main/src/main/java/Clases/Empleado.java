/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sales
 */
public class Empleado extends Persona {
    private TipoEmpleado tipo;
    private String observaciones;
    private Estado estado;

    public Empleado(TipoEmpleado tipo, String observaciones, Estado estado) {
        this.tipo = tipo;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public Empleado(TipoEmpleado tipo, String observaciones, Estado estado, String Cedula, String Nombre, String Apellido1, String Apellido2) {
        super(Cedula, Nombre, Apellido1, Apellido2);
        this.tipo = tipo;
        this.observaciones = observaciones;
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
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
