package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.model.TipoEmpleado;

import java.util.ArrayList;

public interface ICrudEmpleado {

    boolean crearEmpleado(String nombre, String id, Departamento departamento, Proyecto proyecto, TipoEmpleado tipoEmpleado);

    boolean eliminarEmpleado(String id);

    boolean modificarEmpleado(String id, Departamento departamento);

    Empleado getEmpleado(String id);

    ArrayList<Empleado> getEmpleados();
}
