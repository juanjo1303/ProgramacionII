package co.edu.uniquindio.GestionEmpleados.model;

public class Tecnico extends Empleado {
    public Tecnico(){}

    public Tecnico(String nombre, String id, Departamento departamento, Proyecto proyecto) {
        super(nombre, id, departamento, proyecto);
    }
}
