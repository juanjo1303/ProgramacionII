package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Empleado;

import java.util.List;

public interface ICrudEmpleado {

    Empleado crearEmpleado(Empleado empleado);
    void eliminarEmpleado(Empleado empleado);
    Empleado modificarEmpleado(Empleado empleado);
    Empleado buscarEmpleado(Empleado empleado);
    List<Empleado> listarEmpleados();
}
