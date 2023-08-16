/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.hotel.Hotel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sales
 */
public class Habitacion {
    private String  idHabitacion,Descripcion,tipoHabitacion;
    private boolean estado;
    private int Capacidad;

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
    private ArrayList<String> caracteristicas;

    public Habitacion() {
    }

    public Habitacion(String idHabitacion, String Descripcion, boolean estado, String tipoHabitacion, ArrayList<String> caracteristicas,int Capacidad) {
        this.idHabitacion = idHabitacion;
        this.Descripcion = Descripcion;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
        this.caracteristicas = caracteristicas;
        this.Capacidad=Capacidad;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public static void CargaInicial(){
        ArrayList<String> Individuales=new ArrayList<>();
        Individuales.add("Cama Individual");
        Individuales.add("Cable");
        Individuales.add("Servicio a la habitacion");
        Individuales.add("A/C");
        ArrayList<String> Dobles=new ArrayList<>();
        Individuales.add("Cama Doble");
        Individuales.add("Cable");
        Individuales.add("Servicio a la habitacion");
        Individuales.add("A/C");
        Hotel.Habitaciones.add(new Habitacion("1","Individual",true,"Individual",Individuales,1));
        Hotel.Habitaciones.add(new Habitacion("2","Individual",true,"Individual",Individuales,1));
        Hotel.Habitaciones.add(new Habitacion("3","Doble",true,"Doble",Dobles,4));
    
    }
}
