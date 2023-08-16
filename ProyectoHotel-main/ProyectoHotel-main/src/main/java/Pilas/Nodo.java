/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

import Clases.Persona;

/**
 *
 * @author sales
 */
public class Nodo {
    private int PisoActual;
    private Persona persona;
    private Nodo PisoSiguiente;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getPisoActual() {
        return PisoActual;
    }

    public void setPisoActual(int PisoActual) {
        this.PisoActual = PisoActual;
    }

    public Nodo getPisoSiguiente() {
        return PisoSiguiente;
    }

    public void setPisoSiguiente(Nodo PisoSiguiente) {
        this.PisoSiguiente = PisoSiguiente;
    }

    public Nodo(Persona persona,int PisoActual) {
        this.persona=persona;
        this.PisoActual = PisoActual;
        this.PisoSiguiente = null;
    }

    public Nodo() {
    }
    
}
