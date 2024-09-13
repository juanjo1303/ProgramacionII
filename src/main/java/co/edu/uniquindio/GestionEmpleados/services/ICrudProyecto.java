package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

import java.util.ArrayList;

public interface ICrudProyecto {

    boolean crearProyecto(String nombre, String codigo);

    boolean modificarProyecto(String nombre, String codigo);

    boolean eliminarProyecto(String codigo);

    Proyecto getProyecto(String codigo);

    ArrayList<Proyecto> getProyectos();
}
