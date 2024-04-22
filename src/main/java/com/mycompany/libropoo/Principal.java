package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    public static void main (String [ ] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Ingrese el titulo del libro");
    String titulo=sc.next();
    
    System.out.println("Ingrese el autor del libro");
    String autor=sc.next();
    
    System.out.println("Ingrese el genero del libro");
    String genero=sc.next();
    
    
    int anoPublicacion=sc.nextInt();
    Libro biblioteca = new Libro (  titulo,  autor,  genero);
    
    String informacion=biblioteca.mostrarInformacion();
    boolean yaSeleyo=biblioteca.leido;
    boolean antiguedad=biblioteca.esantiguo();
        System.out.println(informacion);
    if (yaSeleyo=true){
        System.out.println("ya fue leido");
    }
    else {System.out.println("no ha sido leido");
    }
       if(antiguedad=true){
           System.out.println("El libro es antiguo");
       }
       else {
           System.out.println("El libro no es aniguo");
           System.out.println("El año de publicacion es:"+anoPublicacion);
       }
    }
    
}
