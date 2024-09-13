package co.edu.uniquindio.GestionEmpleados.model.builder;

import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Empleado;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;

public abstract class EmpleadoBuilder<T extends EmpleadoBuilder<T>> {
    protected String nombre;
    protected String id;
    protected Departamento departamento;
    protected Proyecto proyecto;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    public T id(String id) {
        this.id = id;
        return self();
    }

    public T departamento(Departamento departamento) {
        this.departamento = departamento;
        return self();
    }

    public T proyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Empleado build();
}