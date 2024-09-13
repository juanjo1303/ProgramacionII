package co.edu.uniquindio.GestionEmpleados.model.builder;

import co.edu.uniquindio.GestionEmpleados.model.Gerente;

public class GerenteBuilder extends EmpleadoBuilder<GerenteBuilder> {
    @Override
    protected GerenteBuilder self() {
        return this;
    }

    @Override
    public Gerente build() {
        return new Gerente(nombre, id, departamento, proyecto);
    }
}
