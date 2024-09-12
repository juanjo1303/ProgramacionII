package co.edu.uniquindio.GestionEmpleados.services;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;

import java.util.ArrayList;

public interface ICrudDepartamento {

    Departamento crearDepartamento(Departamento departamento);
    void eliminarDepartamento(Departamento departamento);
    Departamento modificarDepartamento(Departamento departamento);
    Departamento buscarDepartamento(Departamento departamento);
    ArrayList<Departamento> listarDepartamentos();
}
