package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

import java.util.List;

public interface ICrudProyecto {

    Proyecto crearProyecto(Proyecto proyecto);
    Proyecto modificarProyecto(Proyecto proyecto);
    Proyecto buscarProyecto(Proyecto proyecto);
    void eliminarProyecto(Proyecto proyecto);
    List<Proyecto> listarProyectos();
}
