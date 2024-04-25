package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro.");
        String titulo = sc.nextLine();

        System.out.println("Ingrese el autor del libro.");
        String autor = sc.next();

        System.out.println("Ingrese el genero del libro.");
        String genero = sc.next();

        System.out.println("Ingrese el año de publicación del libro.");
        int anoPublicacion = sc.nextInt();

        Libro biblioteca = new Libro(titulo, autor, genero, anoPublicacion);

        String informacion = biblioteca.mostrarInformacion();
        boolean yaSeleyo = biblioteca.getLeido();
        int anioact=biblioteca.anoact();
        
        boolean antiguedad = biblioteca.esantiguo();
       
        System.out.println(informacion);
        
        if (yaSeleyo) {
            System.out.println("El libro ya fue leido.");
        } else {
            System.out.println("El libro aun no ha sido leido");
        }
        if (antiguedad) {
            System.out.println("El libro es antiguo, tiene mas de 50 años de antiguedad.");
            System.out.println("El año de publicacion es: " + anoPublicacion);
            System.out.println("El año acutal es: "+anioact);
        } else {
            System.out.println("El libro no es aniguo por ende tiene menos de 50 años.");
            System.out.println("El año de publicacion es: " + anoPublicacion);
        }
    }

}
