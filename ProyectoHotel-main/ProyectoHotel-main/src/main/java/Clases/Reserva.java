/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import ListaDoble.NodoDoble;
import static com.mycompany.hotel.Hotel.Reservas;
import java.time.LocalDate;

/**
 *
 * @author sales
 */
public class Reserva {

    private String descripcion;
    private LocalDate fechaInicio, fechaFinal, fechaCreacion;
    private int numeroPersonas, idReserva;
    private Persona persona;
    private Estado estado;
    private String observaciones;

    public Persona getHuesped() {
        return persona;
    }

    public void setHuesped(Persona persona) {
        this.persona = persona;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaInicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the fechaCreacion
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the numeroPersonas
     */
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    //Para mostrar la informacion de la clase
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nReserva");
        sb.append("\nidReserva=").append(idReserva);
        sb.append("\ndescripcion=").append(descripcion);
        sb.append("\nfechaInicio=").append(fechaInicio);
        sb.append("\nfechaFinal=").append(fechaFinal);
        sb.append("\n fechaCreacion=").append(fechaCreacion);
        sb.append("\nnumeroPersonas=").append(numeroPersonas);
        sb.append("\npersona=").append(persona);
        sb.append("\nestado=").append(estado);
        sb.append("\nobservaciones=").append(observaciones);
        return sb.toString();
    }

    /**
     * @param numeroPersonas the numeroPersonas to set
     */
    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public static Reserva ObtenerReserva(int reserva) {
        Reserva aux = new Reserva();
        NodoDoble temp = Reservas.getCabeza();
        while (temp != null) {
            if (((Reserva) temp.getElemento()).idReserva == (reserva)) {
                aux = (Reserva) temp.getElemento();
                break;
            }
            temp = temp.getSiguiente();
        }
        return aux;
    }

    public static boolean ActualizarReserva(Reserva reserva) {
        Reserva aux = new Reserva();
        int posicion = -1;
        int contador = 0;
        boolean flag = false;
        NodoDoble temp = Reservas.getCabeza();
        while (temp != null) {
            if (((Reserva) temp.getElemento()).idReserva == (reserva.getIdReserva())) {
                posicion = contador;
                aux = (Reserva)temp.getElemento();
                flag = true;
                break;
            }
            contador++;
        }
        Reservas.actualizarEnPosicion(posicion, aux);
        return flag;
    }
}
