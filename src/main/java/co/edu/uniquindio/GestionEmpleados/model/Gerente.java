package co.edu.uniquindio.GestionEmpleados.model;

public class Gerente extends Empleado{
    public Gerente(){}

    public Gerente(String nombre, String id, Departamento departamento, Proyecto proyecto){
        super(nombre, id, departamento, proyecto);
    }
}