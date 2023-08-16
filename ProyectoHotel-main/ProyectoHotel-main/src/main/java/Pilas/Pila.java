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
public class Pila {

    private Nodo Inicio;
    private int Tamanho;

    public Nodo getInicio() {
        return Inicio;
    }

    public void setInicio(Nodo Inicio) {
        this.Inicio = Inicio;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }
    
    public Pila() {
        Inicio = null;
    }

    public boolean Vacio() {
        return Inicio == null;
    }

    public void Agregar(Persona persona,int Piso) {
        Nodo aux = new Nodo(persona,Piso);
        if (Vacio()) {
            Inicio = aux;
        } else {
            aux.setPisoSiguiente(aux);
            Inicio = aux;
        }
        Tamanho++;
    }

    public int PisoSiguiente() {
        if (!Vacio()) {
            int piso = Inicio.getPisoActual();
            Inicio = Inicio.getPisoSiguiente();
            Tamanho--;
            return piso;
        }
        return -1;
    }
    public Nodo PisoActual(){
    
        if (!Vacio()) {
            return Inicio;
        }
        return new Nodo();
    }
}
