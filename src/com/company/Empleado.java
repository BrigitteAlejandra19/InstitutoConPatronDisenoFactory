package com.company;

public abstract class  Empleado implements IEmpleado{
    protected String nombre;
    protected TipoEmpleado cargo;
    protected String salario;

    public Empleado(String nombre, TipoEmpleado cargo, String salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void actualizarDatos(TipoEmpleado tipoEmpleado, String nombre, String salario){
        this.nombre = nombre;
        this.cargo = tipoEmpleado;
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(TipoEmpleado cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEmpleado getCargo() {
        return cargo;
    }

    public void setCargo(TipoEmpleado cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
