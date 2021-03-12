package com.company;

import java.util.Scanner;

public class Registro {
    private Scanner scanner;

    public Registro() {

        scanner = new Scanner(System.in);
    }

    public void agregarUsuario() throws DatosIncorrectosException {
        Usuario usuario = new Usuario();
        System.out.println("Bienvenido al sistema de premios.");
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        usuario.setNombre(nombre);
        System.out.println("Ingrese su legajo");
        String legajo = scanner.nextLine();
        legajo = legajo.toUpperCase();

        if (!legajo.startsWith("A") && !legajo.startsWith("B") && !legajo.startsWith("C")) {
            throw new DatosIncorrectosException("Empezar con A,B o C");
        }

        if(legajo.length() != 4){
            throw new DatosIncorrectosException("El legajo debe de tener 4 carateres unicamente");
        }

        usuario.setLegajo(legajo);

    }

}

