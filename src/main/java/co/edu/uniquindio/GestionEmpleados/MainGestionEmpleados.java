package co.edu.uniquindio.GestionEmpleados;

import co.edu.uniquindio.GestionEmpleados.factory.ModelFactory;
import co.edu.uniquindio.GestionEmpleados.model.Departamento;
import co.edu.uniquindio.GestionEmpleados.model.Proyecto;
import co.edu.uniquindio.GestionEmpleados.model.TipoEmpleado;

public class MainGestionEmpleados {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudEmpleado(modelFactory);
    }

    public static void crudEmpleado(ModelFactory modelFactory) {
        crearEmpleado(modelFactory);
        eliminarEmpleado(modelFactory);
    }

    public static void crearEmpleado(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearEmpleado("Juan","1234", new Departamento(), new Proyecto(), TipoEmpleado.TECNICO);
        System.out.println("El proceso de creacion ha finalizado con un estado de: " + creado);
    }

    public static void eliminarEmpleado(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarEmpleado("1234");
        System.out.println("El proceso de eliminacion ha finalizado con un estado de: " + eliminado);
    }
}