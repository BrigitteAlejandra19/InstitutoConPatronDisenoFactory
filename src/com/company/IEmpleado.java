package com.company;

public interface IEmpleado {

    String getSalario();
    TipoEmpleado getCargo();
    String getNombre();
    void actualizarDatos(TipoEmpleado tipoEmpleado, String nombre, String salario);


}
