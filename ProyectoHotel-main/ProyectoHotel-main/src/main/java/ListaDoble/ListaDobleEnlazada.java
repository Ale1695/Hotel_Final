/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

public class ListaDobleEnlazada {
    NodoDoble cabeza;
    NodoDoble cola;
int tamanho;

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public NodoDoble getCola() {
        return cola;
    }

    public void setCola(NodoDoble cola) {
        this.cola = cola;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public ListaDobleEnlazada() {
        cabeza = null;
        cola = null;
        tamanho=0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
public Object buscar(Object elemento) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.elemento.equals(elemento)) {
                return actual.elemento;
            }
            actual = actual.siguiente;
        }
        return null; // Retorna null si no se encontró el elemento
    }
    public void agregarAlFinal(Object elemento) {
        NodoDoble nuevoNodo = new NodoDoble(elemento);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
                tamanho++;
    }

    public void agregarAlInicio(Object elemento) {
        NodoDoble nuevoNodo = new NodoDoble(elemento);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
                tamanho++;
    }

    public void imprimirHaciaAdelante() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.elemento + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
public boolean actualizarEnPosicion(int posicion, Object nuevoElemento) {
        if (posicion < 0 || posicion >= tamanho) {
            return false; // Posición fuera de rango
        }
        
        NodoDoble actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        
        actual.elemento = nuevoElemento;
        return true; // Elemento actualizado con éxito
    }
    public void imprimirHaciaAtras() {
        NodoDoble actual = cola;
        while (actual != null) {
            System.out.print(actual.elemento + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }
}