package co.edu.uniquindio.GestionEmpleados.factory;

import co.edu.uniquindio.GestionEmpleados.model.*;
import co.edu.uniquindio.GestionEmpleados.services.ICrudDepartamento;
import co.edu.uniquindio.GestionEmpleados.services.ICrudEmpleado;
import co.edu.uniquindio.GestionEmpleados.services.ICrudProyecto;

import java.util.ArrayList;

public class ModelFactory implements ICrudEmpleado, ICrudDepartamento, ICrudProyecto {
    private static ModelFactory instance;
    private static Empresa empresa;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean crearEmpleado(String nombre, String id, Departamento departamento, Proyecto proyecto, TipoEmpleado tipoEmpleado) {
        return empresa.crearEmpleado(nombre, id, departamento, proyecto, tipoEmpleado);
    }

    @Override
    public boolean eliminarEmpleado(String id) {
        return empresa.eliminarEmpleado(id);
    }

    @Override
    public boolean modificarEmpleado(String id, Departamento departamento) {
        return empresa.modificarEmpleado(id, departamento);
    }

    @Override
    public Empleado getEmpleado(String id) {
        return empresa.getEmpleado(id);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return empresa.getEmpleados();
    }

    @Override
    public boolean crearDepartamento(String nombre, String codigo) {
        return empresa.crearDepartamento(nombre, codigo);
    }

    @Override
    public boolean eliminarDepartamento(String codigo) {
        return empresa.eliminarDepartamento(codigo);
    }

    @Override
    public boolean modificarDepartamento(String codigo, String nombre) {
        return empresa.modificarDepartamento(codigo, nombre);
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        return empresa.getDepartamento(codigo);
    }

    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return empresa.getDepartamentos();
    }

    @Override
    public boolean crearProyecto(String nombre, String codigo) {
        return empresa.crearProyecto(nombre, codigo);
    }

    @Override
    public boolean eliminarProyecto(String codigo) {
        return empresa.eliminarProyecto(codigo);
    }

    @Override
    public boolean modificarProyecto(String codigo, String nombre) {
        return empresa.modificarProyecto(codigo, nombre);
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        return empresa.getProyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return empresa.getProyectos();
    }

    /**
     * Inicializa los datos de la empresa, incluyendo empleados, proyectos y despartamentos.
     *
     * @return una instancia de Empresa con datos predefinidos.
     */
    private static void inicializarDatos() {
        empresa = new Empresa();
        empresa.setNombre("EmpresaPiloto");

        //Proyectos
        Proyecto proyecto1 = new Proyecto("Proyecto 1", "0000");
        Proyecto proyecto2 = new Proyecto("Proyecto 2", "0001");
        Proyecto proyecto3 = new Proyecto("Proyecto 3", "0002");
        Proyecto proyecto4 = new Proyecto("Proyecto 4", "0003");

        //Departamentos
        Departamento departamento1 = new Departamento("Departamento 1", "0000");
        Departamento departamento2 = new Departamento("Departamento 2", "0001");
        Departamento departamento3 = new Departamento("Departamento 3", "0002");
        Departamento departamento4 = new Departamento("Departamento 4", "0003");

        //Gerentes
        Empleado gerente1 = new Gerente("Gerente1", "0000", departamento1, proyecto1);
        Empleado gerente2 = new Gerente("Gerente2", "0001", departamento2, proyecto2);
        Empleado gerente3 = new Gerente("Gerente3", "0002", departamento3, proyecto3);
        Empleado gerente4 = new Gerente("Gerente4", "0003", departamento4, proyecto4);

        //Tecnico
        Empleado tecnico1 = new Tecnico("Tecnico1", "0000", departamento1, proyecto1);
        Empleado tecnico2 = new Tecnico("Tecnico2", "0001", departamento2, proyecto2);
        Empleado tecnico3 = new Tecnico("Tecnico3", "0002", departamento3, proyecto3);
        Empleado tecnico4 = new Tecnico("Tecnico4", "0003", departamento4, proyecto4);

        //Asignacion en empresa
        empresa.getProyectos().add(proyecto1);
        empresa.getProyectos().add(proyecto2);
        empresa.getProyectos().add(proyecto3);
        empresa.getProyectos().add(proyecto4);
        empresa.getDepartamentos().add(departamento1);
        empresa.getDepartamentos().add(departamento2);
        empresa.getDepartamentos().add(departamento3);
        empresa.getDepartamentos().add(departamento4);
        empresa.getEmpleados().add(gerente1);
        empresa.getEmpleados().add(gerente2);
        empresa.getEmpleados().add(gerente3);
        empresa.getEmpleados().add(gerente4);
        empresa.getEmpleados().add(tecnico1);
        empresa.getEmpleados().add(tecnico2);
        empresa.getEmpleados().add(tecnico3);
        empresa.getEmpleados().add(tecnico4);

        //Asignacion de empleados a departamento
        departamento1.registrarEmpleado(gerente1);
        departamento1.registrarEmpleado(tecnico1);
        departamento2.registrarEmpleado(gerente2);
        departamento2.registrarEmpleado(tecnico2);
        departamento3.registrarEmpleado(gerente3);
        departamento3.registrarEmpleado(tecnico3);
        departamento4.registrarEmpleado(gerente4);
        departamento4.registrarEmpleado(tecnico4);

        //Asignacion de empleados a proyecto
        proyecto1.registrarEmpleado(gerente1);
        proyecto1.registrarEmpleado(tecnico1);
        proyecto2.registrarEmpleado(gerente2);
        proyecto2.registrarEmpleado(tecnico2);
        proyecto3.registrarEmpleado(gerente3);
        proyecto3.registrarEmpleado(tecnico3);
        proyecto4.registrarEmpleado(gerente4);
        proyecto4.registrarEmpleado(tecnico4);
    }
}