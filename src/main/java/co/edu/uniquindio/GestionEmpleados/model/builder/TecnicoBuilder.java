package co.edu.uniquindio.GestionEmpleados.model.builder;

import co.edu.uniquindio.GestionEmpleados.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder<TecnicoBuilder>{
    @Override
    protected TecnicoBuilder self() {
        return this;
    }

    @Override
    public Tecnico build() {
        return new Tecnico(nombre, id, departamento, proyecto);
    }
}
