/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sales
 */
public class Huesped extends Persona {
    private LocalDate FechaNacimiento;
    private Nacionalidad nacionalidad;
    private String telefono,otro;
    private ArrayList<Persona> Personas;
    private ArrayList<Habitacion> Habitaciones;

    public Huesped() {
        this.Personas=new ArrayList<>();
        this.Habitaciones=new ArrayList<>();
    }

    public Huesped(LocalDate FechaNacimiento, Nacionalidad nacionalidad, String telefono, String otro) {
        this.FechaNacimiento = FechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.otro = otro;
        this.Personas=new ArrayList<>();
    }

    public Huesped(LocalDate FechaNacimiento, Nacionalidad nacionalidad, String telefono, String otro, String Cedula, String Nombre, String Apellido1, String Apellido2) {
        super(Cedula, Nombre, Apellido1, Apellido2);
        this.FechaNacimiento = FechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.otro = otro;
    }
public Nacionalidad ObtenerNacionalidad(String pNacionalidad){
for (Nacionalidad nac : Nacionalidad.values()) {
            if (nac.name().equals(pNacionalidad)) {
                return nac;
            }
        }
        return null;

}
    /**
     * @return the FechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the nacionalidad
     */
    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Persona> Personas) {
        this.Personas = Personas;
    }

    /**
     * @return the otro
     */
    public String getOtro() {
        return otro;
    }

    /**
     * @param otro the otro to set
     */
    public void setOtro(String otro) {
        this.otro = otro;
    }
}
