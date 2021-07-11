package com.company;

public abstract class EmpleadoFactory {


    public static IEmpleado getEmpleado(TipoEmpleado tipoEmpleado, String nombre, String salario){
        IEmpleado nuevoEmpleado = switch (tipoEmpleado){
            case JEFEDEPARTAMENTO -> new JefeDepartamento();
            case DIRECTIVO -> new Directivo();
            case DOCENTE -> new Docente();
            case ADMINISTRATIVO -> new Administrativo();

        };
        nuevoEmpleado.actualizarDatos(tipoEmpleado,nombre, salario);
        return nuevoEmpleado;
 }
}