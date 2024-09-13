package co.edu.uniquindio.GestionEmpleados.model;

import co.edu.uniquindio.GestionEmpleados.services.ICrudDepartamento;
import co.edu.uniquindio.GestionEmpleados.services.ICrudEmpleado;
import co.edu.uniquindio.GestionEmpleados.services.ICrudProyecto;
import co.edu.uniquindio.GestionEmpleados.services.IServicio;

import java.util.List;
import java.util.ArrayList;


public class Empresa implements ICrudEmpleado, ICrudProyecto, ICrudDepartamento, IServicio {
    private String nombre;
    private List<Empleado> listEmpleados = new ArrayList<>();
    private List<Proyecto> listProyectos = new ArrayList<>();
    private List<Departamento> listDepartamentos = new ArrayList<>();

    public Empresa(){
    }

    /**
     * Verifica si un empleado ya existe
     *
     * @param id del empleado a verificar
     * @return un empleado encontrado o null si no existe
     */
    private Empleado verificarEmpleado(String id) {
        Empleado empleadoExistente = null;
        for(Empleado empleado : listEmpleados){
            if(empleado.getId().equals(id)){
                empleadoExistente = empleado;
                break;
            }
        }
        return empleadoExistente;
    }

    /**
     * Verifica si un departamento ya existe
     *
     * @param codigo del departamento a verificar
     * @return un departamento encontrado o null si no existe
     */
    private Departamento verificarDepartamento(String codigo) {
        Departamento departamentoExistente = null;
        for(Departamento departamento : listDepartamentos){
            if(departamento.getCodigo().equals(codigo)){
                departamentoExistente = departamento;
                break;
            }
        }
        return departamentoExistente;
    }

    /**
     * Verifica si un proyecto ya existe
     *
     * @param codigo del proyecto a verificar
     * @return un proyecto encontrado o null si no existe
     */
    private Proyecto verificarProyecto(String codigo) {
        Proyecto proyectoExistente = null;
        for(Proyecto proyecto : listProyectos){
            if(proyecto.getCodigo().equals(codigo)){
                proyectoExistente = proyecto;
                break;
            }
        }
        return proyectoExistente;
    }

    /**
     * Verifica el tipo de empleado que se desea crear
     *
     * @param tipoEmpleado a verificar
     * @return una instancia del tipo de empleado correspondiente
     */
    private Empleado verificarTipoEmpleado(TipoEmpleado tipoEmpleado) {
        if(tipoEmpleado == TipoEmpleado.GERENTE){
            return new Gerente();
        }
        return new Tecnico();
    }

    @Override
    public boolean crearEmpleado(String nombre, String id, Departamento departamento, Proyecto proyecto,TipoEmpleado tipoEmpleado){
        Empleado newEmpleado = verificarTipoEmpleado(tipoEmpleado);
        Empleado empleadoExistente = verificarEmpleado(id);
        if(empleadoExistente == null){
            newEmpleado.setNombre(nombre);
            newEmpleado.setId(id);
            newEmpleado.setDepartamento(departamento);
            newEmpleado.setProyecto(proyecto);
            listEmpleados.add(newEmpleado);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarEmpleado(String id) {
        Empleado empleado = verificarEmpleado(id);
        if(empleado != null){
            listEmpleados.remove(empleado);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarEmpleado(String id, Departamento departamento) {
        Empleado empleado = verificarEmpleado(id);
        if(empleado != null){
            empleado.setDepartamento(departamento);
            return true;
        }
        return false;
    }

    @Override
    public Empleado getEmpleado(String id) {
        return verificarEmpleado(id);
    }

    @Override
    public ArrayList<Empleado> getEmpleados() {
        return (ArrayList<Empleado>) listEmpleados;
    }

    @Override
    public boolean crearDepartamento(String nombre, String codigo) {
        Departamento newDepartamento = new Departamento();
        Departamento departamentoExistente = verificarDepartamento(codigo);
        if(departamentoExistente == null){
            newDepartamento.setNombre(nombre);
            newDepartamento.setCodigo(codigo);
            listDepartamentos.add(newDepartamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarDepartamento(String codigo) {
        Departamento departamento = verificarDepartamento(codigo);
        if(departamento != null){
            listDepartamentos.remove(departamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarDepartamento(String codigo, String nombre) {
        Departamento departamento = verificarDepartamento(codigo);
        if(departamento != null){
            departamento.setNombre(nombre);
        }
        return false;
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        return verificarDepartamento(codigo);
    }

    @Override
    public ArrayList<Departamento> getDepartamentos() {
        return (ArrayList<Departamento>) listDepartamentos ;
    }

    @Override
    public boolean crearProyecto(String nombre, String codigo) {
        Proyecto newProyecto = new Proyecto();
        Proyecto proyectoExistente = verificarProyecto(codigo);
        if(proyectoExistente == null){
            newProyecto.setNombre(nombre);
            newProyecto.setCodigo(codigo);
            listProyectos.add(newProyecto);
            return true;
        }
        return false;
    }


    @Override
    public boolean eliminarProyecto(String codigo) {
        Proyecto proyecto = verificarProyecto(codigo);
        if(proyecto != null){
            listProyectos.remove(proyecto);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarProyecto(String codigo, String nombre) {
        Proyecto proyecto = verificarProyecto(codigo);
        if(proyecto != null){
            proyecto.setNombre(nombre);
            return true;
        }
        return false;
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        return verificarProyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return (ArrayList<Proyecto>) listProyectos;
    }

    @Override
    public int calcularNumProfesionales() {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}