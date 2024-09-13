package co.edu.uniquindio.GestionEmpleados.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> listEmpleados = new ArrayList<Empleado>();

    public Departamento(){}

    public Departamento(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private Empleado verificarEmpleado(String id) {
        Empleado empleadoExistente = null;
        for (Empleado empleado : listEmpleados) {
            if (empleado.getId().equals(id)) {
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }

    public void registrarEmpleado(Empleado empleado) {
        Empleado newEmpleado = verificarEmpleado(empleado.getId());

        if(newEmpleado == null){
            listEmpleados.add(empleado);
        }
    }

    public void eliminarEmpleado(Empleado empleado) {
        Empleado newEmpleado = verificarEmpleado(empleado.getId());

        if(newEmpleado != null){
            listEmpleados.remove(empleado);
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) listEmpleados;
    }
}
