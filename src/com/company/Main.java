package com.company;

public class Main {

    public static void main(String[] args) throws DatosIncorrectosException {
	/*Crear un sistema que permita registrar usuarios de una empresa para un sistema de premios.
Para el registro se necesita el nombre y legajo.

El legajo debe tener 4 letras o números, y comenzar con "A", "B" o "C".

No permitir el registro si el legajo no es correcto.

TIP:
palabra.toUpperCase() // convierte a mayúsculas
palabra.startsWith("HOLA") // verifica si comienza con el texto que pasamos por parámetro.

Método que arroja una excepción
===============================

private void asignarDNI(Integer dni) throws DatosIncorrectosException {
	if(String.valueOf(dni).length()!=8){
		throw new DatosIncorrectosException("El DNI debe tener 8 dígitos.");
	}else{
		this.dni = dni;
	}
}

*/

    Registro registro = new Registro();
    registro.agregarUsuario();

    }
}
