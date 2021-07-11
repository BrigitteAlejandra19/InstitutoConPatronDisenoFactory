package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TipoEmpleado tipoEmpleado = TipoEmpleado.DOCENTE;


        IEmpleado empleado = EmpleadoFactory.getEmpleado(tipoEmpleado.DOCENTE, "Pablo" , "8");

        System.out.println("Soy "+empleado.getNombre());
        System.out.println(empleado);

    }

     /*
            Un instituto necesita modelar su sistema de gestión de empleados.
            Utilizar el método Factory para armar un esquema que permita crear objetos de tipo:
            Los objetos de cada clase deben poder indicar su cargo, salario y nombre.
         */
}
