/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Pilas.Pila;

/**
 *
 * @author sales
 */
public class Ascensor {

    private int ID, Capacidad, PersonasActualmente;
    private String Observaciones;
    private boolean Estado;
    private Pila pisos;
    

    public Ascensor() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getPersonasActualmente() {
        return PersonasActualmente;
    }

    public void setPersonasActualmente(int PersonasActualmente) {
        this.PersonasActualmente = PersonasActualmente;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Pila getPisos() {
        return pisos;
    }

    public void setPisos(Pila pisos) {
        this.pisos = pisos;
    }

    public Ascensor(int ID, int Capacidad, int PersonasActualmente, String Observaciones, boolean Estado, Pila pisos) {
        this.ID = ID;
        this.Capacidad = Capacidad;
        this.PersonasActualmente = PersonasActualmente;
        this.Observaciones = Observaciones;
        this.Estado = Estado;
        this.pisos = pisos;
    }

    public void AgregarPiso(Persona persona,int Piso) {
        if (pisos.getTamanho() < 10&&PersonasActualmente<Capacidad) {
            this.pisos.Agregar(persona,Piso);
        }
        if (pisos.getTamanho() == 10) {
            this.Estado = false;
        }
        if(PersonasActualmente==Capacidad){
        this.Estado=false;
        }
    }
}
