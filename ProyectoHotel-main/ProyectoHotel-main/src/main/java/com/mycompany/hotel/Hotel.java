/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hotel;

import Clases.Ascensor;
import Clases.*;
import ListaDoble.ListaDobleEnlazada;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sales
 */
public class Hotel {

    public static ListaDobleEnlazada Reservas;
    public static ArrayList<Habitacion> Habitaciones;
    public static ArrayList<Huesped> Huespedes;

    public static void main(String[] args) {
        Reservas = new ListaDobleEnlazada();
        Habitaciones = new ArrayList<>();
        Huespedes = new ArrayList<>();;
        Ascensor asc1, asc2, asc3, asc4;
        int opcion = -1;
        while (opcion != 10) {
            opcion = Menu();
            switch (opcion) {
                case 1:
                    Control_Reserva();
                    break;
                case 2:
                    ConfirmarReserva();
                    break;

            }
        }
    }

    public static int Menu() {
        String Menu = "Menu Hotel\n"
                + "1. Control de Reservaciones\n"
                + "2. Confirmacion de Reserva\n"
                + "10. Salir";
        return Integer.parseInt(JOptionPane.showInputDialog(Menu));

    }

    // Solictar los datos al usuario
    private static void Control_Reserva() {
        Reserva aux = new Reserva();
        Persona temp = new Persona();
        temp.setCedula(JOptionPane.showInputDialog("Ingrese la Identificacion de la persona"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo de la persona");

        //Verificacion con .split para los casos que tienen dos nombres y para guardar el nombre de la persona  
        if (nombre.split(" ").length == 4) {
            temp.setNombre(nombre.split(" ")[0] + " " + nombre.split(" ")[1]);
            temp.setApellido1(nombre.split(" ")[2]);
            temp.setApellido2(nombre.split(" ")[3]);
        } else {
            temp.setNombre(nombre.split(" ")[0]);
            temp.setApellido1(nombre.split(" ")[1]);
            temp.setApellido2(nombre.split(" ")[2]);
        }

        //Para generar ID de Reserva
        aux.setHuesped(temp);
        int ID = ObtenerIdReserva();
        aux.setIdReserva(ID);
        aux.setNumeroPersonas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas que desea reservar")));

        //Creacion de Informacion de tiempos de la reserva
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        aux.setFechaCreacion(LocalDate.now());
        aux.setFechaInicio(LocalDate.parse(JOptionPane.showInputDialog("Digite la fecha en formato dd/MM/yyyy"), formatter));
        aux.setFechaFinal(LocalDate.parse(JOptionPane.showInputDialog("Digite la fecha en formato dd/MM/yyyy"), formatter));
        aux.setObservaciones(JOptionPane.showInputDialog("Ingrese alguna observacion especifica"));
        aux.setEstado(Estado.Pendiente);
        int prioridad = Integer.valueOf(JOptionPane.showInputDialog("""
                                                                    Indique la prioridad de la reserva
                                                                    1) Alta
                                                                    2) Baja
                                                                    """));
        int opcion = JOptionPane.showConfirmDialog(null, " Detalle de la Reserva\n" + aux.toString() + "\n desea continuar?");
        if (opcion == JOptionPane.OK_OPTION) {
            if (prioridad == 1) {
                Reservas.agregarAlInicio(aux);
            } else {
                Reservas.agregarAlFinal(aux);
            }
            JOptionPane.showMessageDialog(null, "Reserva confirmada");
        }
    }

    public static void ConfirmarReserva() {
        int reserva = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero de reservacion"));
        Reserva temp = Reserva.ObtenerReserva(reserva);
        if (temp != null) {
            int opcion = JOptionPane.showConfirmDialog(null, temp.toString());
            if (opcion == JOptionPane.OK_OPTION) {
                temp.setEstado(Estado.Confirmada);
                Reserva.ActualizarReserva(temp);
                Huesped h = new Huesped();
                h.setNombre(temp.getHuesped().getNombre());
                h.setApellido1(temp.getHuesped().getApellido1());
                h.setApellido2(temp.getHuesped().getApellido2());
                h.setCedula(temp.getHuesped().getCedula());
                String[] nacionalidad = new String[Nacionalidad.values().length];
                for (int i = 0; i < nacionalidad.length; i++) {
                    nacionalidad[i] = Nacionalidad.values()[i].toString();
                }
                String nacionalidadSeleccionada = (String) JOptionPane.showInputDialog(
                        null,
                        "Selecciona una nacionalidad:",
                        "Nacionalidad",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        nacionalidad,
                        nacionalidad[0]
                );
                h.setNacionalidad(h.ObtenerNacionalidad(nacionalidadSeleccionada));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Indique la fecha de nacimiento. (dd/MM/yyy)"), formatter);
                h.setFechaNacimiento(fecha);
                if (temp.getNumeroPersonas() > 1) {
                    for (int i = 0; i < temp.getNumeroPersonas(); i++) {
                        Persona p = new Persona();
                        p.setCedula(JOptionPane.showInputDialog("Indique la cedula de la persona No " + (i + 1)));
                        p.setNombre(JOptionPane.showInputDialog("Indique el nombre de la persona No " + (i + 1)));
                        p.setApellido1(JOptionPane.showInputDialog("Indique el primer apellido de la persona No " + (i + 1)));
                        p.setApellido2(JOptionPane.showInputDialog("Indique el segundo apellido de la persona No " + (i + 1)));
                        h.getPersonas().add(p);
                        JOptionPane.showMessageDialog(null, "Persona agregada satisfactoriamente");
                    }
                } else {
                    h.getPersonas().add(temp.getHuesped());
                }
                Huespedes.add(h);
                JOptionPane.showMessageDialog(null, "Reservacion confirmada correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Numero de reserva no encontrado");
        }

    }

    private static int ObtenerIdReserva() {
        return Reservas.getTamanho() + 1;
    }

}
