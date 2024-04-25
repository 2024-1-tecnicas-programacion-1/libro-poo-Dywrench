package com.mycompany.libropoo;

import java.time.Year;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // complejidad temporal O(1)
        System.out.println("Ingrese el titulo del libro.");
        String titulo = sc.nextLine();

        // complejidad temporal O(1)
        System.out.println("Ingrese el autor del libro.");
        String autor = sc.next();

        // complejidad temporal O(1)
        System.out.println("Ingrese el genero del libro.");
        String genero = sc.nextLine();

        // complejidad temporal O(1)
        System.out.println("Ingrese el año de publicación del libro.");
        int anoPublicacion = sc.nextInt();

        // complejidad temporal O(1)
        Libro biblioteca = new Libro(titulo, autor, genero, anoPublicacion);

        // complejidad temporal O(1)
        String informacion = biblioteca.mostrarInformacion();
        boolean yaSeleyo = biblioteca.getLeido();

        // complejidad temporal O(1)
        boolean antiguedad = biblioteca.esantiguo();

        // complejidad temporal O(1)
        System.out.println(informacion);

        // complejidad temporal O(1)
        if (yaSeleyo) {

            System.out.println("El libro ya fue leido.");

        } else {

            System.out.println("El libro aun no ha sido leido");
        }

        // complejidad temporal O(1)
        if (antiguedad) {
            System.out.println("El libro es antiguo, tiene mas de 50 años de antiguedad.");
            System.out.println("El año de publicacion es: " + anoPublicacion);
            System.out.println("El año acutal es: " + Year.now().getValue());
        } else {
            System.out.println("El libro no es aniguo por ende tiene menos de 50 años.");
            System.out.println("El año de publicacion es: " + anoPublicacion);
        }
    }

}
