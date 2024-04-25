package com.mycompany.libropoo;

import java.time.Year;
import java.util.Scanner;
import java.time.LocalDate;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private boolean leido;
    private int anoPublicacion;

    // complejidad temporal O(1)
    public Libro(String titulo, String autor, String genero, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.leido = false;

    }

    // complejidad temporal O(1)
    public String mostrarInformacion() {
        return ("Título: " + titulo + ", " + "Autor: " + autor + ", " + "Año de publicación: " + anoPublicacion + ", " + " Género: " + genero);
    }

    // complejidad temporal O(1)
    public void marcarleido() {
        leido = true;
    }

    // complejidad temporal O(1)
    boolean getLeido() {
        return leido;
    }

    // complejidad temporal O(1)
    public boolean esantiguo() {
        int anoAtual = Year.now().getValue();
        int validarAntiguedad = anoAtual - anoPublicacion;
        return (validarAntiguedad > 50);

    }

}
